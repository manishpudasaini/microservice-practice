package com.micro.user.UserService.exception;

import org.springframework.http.HttpStatus;

public class ExceptionMessage {
    private String message;
    private HttpStatus httpStatus;

    public ExceptionMessage(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
