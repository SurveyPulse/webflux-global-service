package com.example.global.exception.type;


import com.example.global.exception.BaseException;
import com.example.global.exception.ExceptionType;

public class SignInException extends BaseException {

    public Object data;
    public SignInException(ExceptionType exceptionType) {
        super(exceptionType);
    }

    public SignInException(ExceptionType exceptionType, Object data) {
        super(exceptionType);
        this.data = data;
    }

}
