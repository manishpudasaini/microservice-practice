package com.micro.user.UserService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private int userId;
    private String name;
    private String email;
    private String mobileNumber;
    private String about;
}
