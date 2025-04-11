package com.example.global.exception.type;


import com.example.global.exception.BaseException;
import com.example.global.exception.ExceptionType;

public class BadRequestException extends BaseException {

    public BadRequestException(ExceptionType exceptionType) {
        super(exceptionType);
    }

}
