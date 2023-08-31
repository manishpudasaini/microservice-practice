package com.micro.user.UserService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private int ratingId;
    private int userId;
    private int hotelId;
    private int rating;
    private String remarks;

}
