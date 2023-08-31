package com.HotelService.HotelService.repo;

import com.HotelService.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer> {
}
