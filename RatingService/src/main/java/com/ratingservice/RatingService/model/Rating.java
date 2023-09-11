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
    @GeneratedValue(generator = "RATING_SEQ_GEN",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "RATING_SEQ_GEN",sequenceName = "RATING_SEQ",initialValue = 1,allocationSize = 1)
    private int ratingId;
    private int userId;
    private int hotelId;
    private int rating;
    private String remarks;
}
