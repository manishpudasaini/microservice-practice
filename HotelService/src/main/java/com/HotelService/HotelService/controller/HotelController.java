package com.HotelService.HotelService.controller;

import com.HotelService.HotelService.dto.HotelDto;
import com.HotelService.HotelService.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hotels")
public class HotelController {
    private final HotelService hotelService;
    @PostMapping
    public ResponseEntity<HotelDto> saveHotel(@RequestBody HotelDto hotelDto){
        return new ResponseEntity<>(hotelService.saveHotel(hotelDto), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<HotelDto>> getAllHotel(){
        return new ResponseEntity<>(hotelService.getAllHotel(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelDto> getHotel(@PathVariable int id){
        return new ResponseEntity<>(hotelService.getHotelById(id),HttpStatus.OK);
    }
}
