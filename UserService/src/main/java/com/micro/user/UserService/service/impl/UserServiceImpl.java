package com.micro.user.UserService.service.impl;

import com.micro.user.UserService.dto.UserDto;
import com.micro.user.UserService.exception.UserNotFoundException;
import com.micro.user.UserService.model.User;
import com.micro.user.UserService.repo.UserRepo;
import com.micro.user.UserService.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    @Override
    public UserDto saveUser(UserDto userDto) {
        return entityToDto(userRepo.save(dtoToEntity(userDto)));
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> allUsers = userRepo.findAll();
        return allUsers.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public UserDto getUser(Integer id) {
       Optional<User> user = userRepo.findById(id);
       if(user.isPresent()){
           return entityToDto(user.get());
        }
        throw new UserNotFoundException("User having this "+ id +" does not exist ");
    }

    public User dtoToEntity(UserDto userDto){
        return User.builder().name(userDto.getName())
                .email(userDto.getEmail())
                .mobileNumber(userDto.getMobileNumber())
                .about(userDto.getAbout())
                .build();
    }
    public UserDto entityToDto(User user){
        return UserDto.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .email(user.getEmail())
                .mobileNumber(user.getMobileNumber())
                .about(user.getAbout())
                .build();
    }
}
