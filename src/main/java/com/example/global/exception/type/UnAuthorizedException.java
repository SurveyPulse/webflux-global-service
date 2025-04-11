package com.example.global.exception.type;


import com.example.global.exception.BaseException;
import com.example.global.exception.ExceptionType;

public class UnAuthorizedException extends BaseException {

    public UnAuthorizedException(ExceptionType exceptionType) {
        super(exceptionType);
    }

}
