package com.HotelService.HotelService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {HotelNotFoundException.class})
    public ResponseEntity<ApiExceptionMessage> hotelNotFound(HotelNotFoundException hotelNotFoundException){
        ApiExceptionMessage message = new
                ApiExceptionMessage(hotelNotFoundException.getMessage(), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(message,HttpStatus.NOT_FOUND);
    }
}
