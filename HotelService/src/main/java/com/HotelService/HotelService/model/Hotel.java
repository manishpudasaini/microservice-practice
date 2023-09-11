package com.HotelService.HotelService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {
    @Id
    @GeneratedValue(generator = "HOTEL_SEQ_GEN",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "HOTEL_SEQ_GEN",sequenceName = "HOTEL_SEQ",initialValue = 1,allocationSize = 1)
    private int id;
    private String name;
    private String location;
    private String about;
}
