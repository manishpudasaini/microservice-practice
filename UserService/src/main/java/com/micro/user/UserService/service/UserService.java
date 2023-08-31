package com.micro.user.UserService.service;

import com.micro.user.UserService.dto.UserDto;
import com.micro.user.UserService.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    UserDto saveUser(UserDto userDto);
    List<UserDto> getAllUser();

    UserDto getUser(Integer id);

}
