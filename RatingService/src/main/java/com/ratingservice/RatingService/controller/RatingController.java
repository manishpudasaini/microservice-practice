package com.ratingservice.RatingService.controller;

import com.ratingservice.RatingService.dto.RatingDto;
import com.ratingservice.RatingService.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/rating")
public class RatingController {
    private final RatingService ratingService;
    @PostMapping("/save")
    public ResponseEntity<RatingDto> saveRating(@RequestBody RatingDto ratingDto){
        return new ResponseEntity<>(ratingService.saveRating(ratingDto), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<RatingDto>> allRating(){
      return new ResponseEntity<>(ratingService.getAllRating(),HttpStatus.OK);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<List<RatingDto>> findUsingUserId(@PathVariable Integer userId){
     return new ResponseEntity<>(ratingService.findByUserId(userId),HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<List<RatingDto>> findUsingHotelId(@PathVariable Integer hotelId){
        return new ResponseEntity<>(ratingService.findByHotelId(hotelId),HttpStatus.OK);
    }
}
