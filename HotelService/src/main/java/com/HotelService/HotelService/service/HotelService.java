package com.HotelService.HotelService.service;

import com.HotelService.HotelService.dto.HotelDto;

import java.util.List;

public interface HotelService {
    HotelDto saveHotel(HotelDto hotelDto);
    List<HotelDto> getAllHotel();
    HotelDto getHotelById(Integer id);
}
