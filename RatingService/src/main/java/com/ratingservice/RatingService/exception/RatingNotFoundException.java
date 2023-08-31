package com.ratingservice.RatingService.exception;

public class RatingNotFoundException extends RuntimeException{
    public RatingNotFoundException(String message) {
        super(message);
    }
}
