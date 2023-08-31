package com.ratingservice.RatingService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rating")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ratingId;
    private int userId;
    private int hotelId;
    private int rating;
    private String remarks;
}
