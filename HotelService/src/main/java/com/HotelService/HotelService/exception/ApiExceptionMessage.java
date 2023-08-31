package com.HotelService.HotelService.exception;

import org.springframework.http.HttpStatus;

public class ApiExceptionMessage {
    private String message;
    private HttpStatus httpStatus;

    public ApiExceptionMessage(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
