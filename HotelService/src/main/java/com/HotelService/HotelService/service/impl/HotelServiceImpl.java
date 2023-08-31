package com.HotelService.HotelService.service.impl;

import com.HotelService.HotelService.dto.HotelDto;
import com.HotelService.HotelService.exception.HotelNotFoundException;
import com.HotelService.HotelService.model.Hotel;
import com.HotelService.HotelService.repo.HotelRepo;
import com.HotelService.HotelService.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepo hotelRepo;


    @Override
    public HotelDto saveHotel(HotelDto hotelDto) {
        return entityToDto(hotelRepo.save(dtoToEntity(hotelDto)));
    }

    @Override
    public List<HotelDto> getAllHotel() {
        List<Hotel> allHotels=hotelRepo.findAll();
        return allHotels.stream().map(m -> entityToDto(m)).collect(Collectors.toList());
    }

    @Override
    public HotelDto getHotelById(Integer id) {
        Optional<Hotel> hotel  =hotelRepo.findById(id);
        if(hotel.isPresent()){
            return entityToDto(hotel.get());
        }
        throw new HotelNotFoundException("Hotel having this "+id +" does not exist");
    }

    Hotel dtoToEntity(HotelDto hotelDto){
        return Hotel.builder()
                .name(hotelDto.getName())
                .location(hotelDto.getLocation())
                .about(hotelDto.getAbout())
                .build();
    }
    HotelDto entityToDto(Hotel hotel){
        return HotelDto.builder()
                .id(hotel.getId())
                .name(hotel.getName())
                .about(hotel.getAbout())
                .location(hotel.getLocation())
                .build();
    }
}
