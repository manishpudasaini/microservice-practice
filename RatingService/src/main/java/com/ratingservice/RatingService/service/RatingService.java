package com.ratingservice.RatingService.service;

import com.ratingservice.RatingService.dto.RatingDto;

import java.util.List;

public interface RatingService {
    RatingDto saveRating(RatingDto ratingDto);
    List<RatingDto> getAllRating();
    List<RatingDto> findByUserId(Integer id);
    List<RatingDto> findByHotelId(Integer id);
    RatingDto findById(Integer id);

}
