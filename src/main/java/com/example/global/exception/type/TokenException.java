package com.example.global.exception.type;


import com.example.global.exception.BaseException;
import com.example.global.exception.ExceptionType;

public class TokenException extends BaseException {

    public TokenException(ExceptionType exceptionType){
        super(exceptionType);
    }

}
