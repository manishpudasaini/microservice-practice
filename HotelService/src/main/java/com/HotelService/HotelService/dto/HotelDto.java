package com.HotelService.HotelService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelDto {
    private int id;
    private String name;
    private String location;
    private String about;
}
