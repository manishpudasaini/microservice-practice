package com.ratingservice.RatingService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {RatingNotFoundException.class})
    public ResponseEntity<ApiExceptionMessage> ratingNotFound(RatingNotFoundException ratingNotFoundException){
        ApiExceptionMessage apiExceptionMessage = new
                ApiExceptionMessage(ratingNotFoundException.getMessage(), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(apiExceptionMessage,HttpStatus.NOT_FOUND);
    }
}

