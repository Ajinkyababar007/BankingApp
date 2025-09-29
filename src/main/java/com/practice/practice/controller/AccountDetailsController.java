package com.practice.practice.controller;

import com.practice.practice.dto.UserDto;
import com.practice.practice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hsbc/accountoverview")
@RequiredArgsConstructor
public class AccountDetailsController {
    private final UserService userService;

    @GetMapping("/accountdetails/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/accountdetails")
    public List<UserDto> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/accountdetails")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @PostMapping("/accountdetails")
    public UserDto createAccount(@RequestBody UserDto userDto){
        return userService.createAccount(userDto);
    }
}
