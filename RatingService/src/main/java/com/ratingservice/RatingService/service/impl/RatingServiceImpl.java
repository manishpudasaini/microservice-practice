package com.ratingservice.RatingService.service.impl;

import com.ratingservice.RatingService.dto.RatingDto;
import com.ratingservice.RatingService.exception.RatingNotFoundException;
import com.ratingservice.RatingService.model.Rating;
import com.ratingservice.RatingService.repo.RatingRepo;
import com.ratingservice.RatingService.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService{
    private final RatingRepo ratingRepo;

    @Override
    public RatingDto saveRating(RatingDto ratingDto) {
        return entityToDto(ratingRepo.save(dtoToEntity(ratingDto)));
    }

    @Override
    public List<RatingDto> getAllRating() {
        List<Rating> allRating = ratingRepo.findAll();
        return allRating.stream().map(this::entityToDto).toList();
    }

    @Override
    public List<RatingDto> findByUserId(Integer id) {
        List<Rating> allRating = ratingRepo.findByUserId(id);
        return allRating.stream().map(this::entityToDto).toList();
    }

    @Override
    public List<RatingDto> findByHotelId(Integer id) {
        List<Rating> ratings = ratingRepo.findByHotelId(id);
        return ratings.stream().map(this::entityToDto).toList();
    }

    @Override
    public RatingDto findById(Integer id) {
        Optional<Rating> rating = ratingRepo.findById(id);
        if(rating.isPresent()){
            return entityToDto(rating.get());
        }
        throw new RatingNotFoundException("Rating having this id does not exist");
    }

    Rating dtoToEntity(RatingDto ratingDto){
        return Rating.builder()
                .hotelId(ratingDto.getHotelId())
                .userId(ratingDto.getUserId())
                .rating(ratingDto.getRating())
                .remarks(ratingDto.getRemarks())
                .build();
    }

    RatingDto entityToDto(Rating rating){
        return RatingDto.builder()
                .ratingId(rating.getRatingId())
                .userId(rating.getUserId())
                .hotelId(rating.getHotelId())
                .rating(rating.getRating())
                .remarks(rating.getRemarks()).build();
    }
}
