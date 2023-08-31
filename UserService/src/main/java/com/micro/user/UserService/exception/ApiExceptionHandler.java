package com.micro.user.UserService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<ExceptionMessage> userNotfound(UserNotFoundException userNotFoundException){
        ExceptionMessage exceptionMessage = new
                ExceptionMessage(userNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(exceptionMessage,HttpStatus.NOT_FOUND);
    }
}
