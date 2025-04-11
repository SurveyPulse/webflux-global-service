package com.example.global.exception.type;


import com.example.global.exception.BaseException;
import com.example.global.exception.ExceptionType;

public class NotFoundException extends BaseException {

    public NotFoundException(ExceptionType exceptionType) {
        super(exceptionType);
    }

}