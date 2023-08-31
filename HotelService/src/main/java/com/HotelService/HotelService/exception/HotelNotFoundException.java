package com.HotelService.HotelService.exception;

public class HotelNotFoundException extends RuntimeException{
    public HotelNotFoundException(String message) {
        super(message);
    }
}
