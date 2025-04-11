package com.example.global.exception.type;


import com.example.global.exception.BaseException;
import com.example.global.exception.ExceptionType;

public class ForbiddenException extends BaseException {

    public ForbiddenException(ExceptionType exceptionType) {
        super(exceptionType);
    }

}
