````markdown
# SurveyPulse 글로벌 WebFlux 모듈

Spring WebFlux 기반 서비스에서 공통으로 사용되는 기능들을 모듈화하여 JitPack으로 배포하는 라이브러리입니다.

## 주요 기능 모듈

### 1. 리액티브 인증 및 인가 (Reactive Security)
- **Spring Security WebFlux 설정**
- **JWT 기능 (Reactive)**

### 2. 글로벌 리액티브 예외 처리기
- **`@ControllerAdvice` 기반 핸들러**
  - JSON 응답 포맷 일관화 (error code, message, timestamp)
- **공통 예외 계층**
  - `BaseException` 추상 클래스 및 `ExceptionType` 인터페이스 정의
