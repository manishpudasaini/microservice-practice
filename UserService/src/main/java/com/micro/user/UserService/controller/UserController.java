package com.micro.user.UserService.controller;

import com.micro.user.UserService.dto.UserDto;
import com.micro.user.UserService.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    @Operation(summary = "Save User info", tags = {"Save-User"})
    @ApiResponse(responseCode = "200",description = "Return User dto", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))})
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto){
       UserDto afterSave =  userService.saveUser(userDto);
        return new ResponseEntity<>(afterSave,HttpStatus.OK);
    }

    @GetMapping
    @Operation(summary = "get all User info", tags = {"get-all-User"})
    @ApiResponse(responseCode = "200",description = "Return User dto list", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))})
    public ResponseEntity<List<UserDto>> allUsers(){
       List<UserDto> allUsers =  userService.getAllUser();
       return new ResponseEntity<>(allUsers,HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @Operation(summary = "get User info", tags = {"get-User"})
    @ApiResponse(responseCode = "200",description = "Return User dto", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))})
    public ResponseEntity<UserDto> getUser(@PathVariable Integer id){
      UserDto user = userService.getUser(id);
      return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
