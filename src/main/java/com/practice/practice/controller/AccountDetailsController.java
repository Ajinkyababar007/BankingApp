package com.practice.practice.controller;

import com.practice.practice.dto.UserDto;
import com.practice.practice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hsbc/accountoverview")
@RequiredArgsConstructor
public class AccountDetailsController {
    private final UserService userService;

    @GetMapping("/accountdetails/{id}")
    public UserDto getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }


}
