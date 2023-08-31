package com.ratingservice.RatingService.repo;

import com.ratingservice.RatingService.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,Integer> {

    @Query(nativeQuery = true,value = "Select * from rating where user_id=?1")
    List<Rating> findByUserId(Integer id);
    @Query(nativeQuery = true,value = "Select * from rating where hotel_id=?1")
    List<Rating> findByHotelId(Integer id);
}
