package com.example.global.config.jwt;

import com.example.global.entity.BasicUser;
import com.example.global.entity.BasicUserDetails;
import com.example.global.entity.BasicUserImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

public class ReactiveJWTFilter implements WebFilter {

    private final JWTUtil jwtUtil;

    public ReactiveJWTFilter(JWTUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        String authorization = exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
        if (authorization == null || !authorization.startsWith("Bearer ")) {
            return chain.filter(exchange);
        }
        String token = authorization.substring("Bearer ".length());
        if (jwtUtil.isExpired(token)) {
            return chain.filter(exchange);
        }
        String username = jwtUtil.getUsername(token);
        String role = jwtUtil.getRole(token);
        String password = "tmppassword"; // 토큰 기반이므로 임시 값 사용

        BasicUser basicUser = new BasicUserImpl(username, password, role);
        BasicUserDetails userDetails = new BasicUserDetails(basicUser);
        UsernamePasswordAuthenticationToken authToken =
                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

        return chain.filter(exchange)
                    .contextWrite(ReactiveSecurityContextHolder.withAuthentication(authToken));
    }
}
