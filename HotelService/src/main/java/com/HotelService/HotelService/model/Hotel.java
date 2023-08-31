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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String location;
    private String about;
}
