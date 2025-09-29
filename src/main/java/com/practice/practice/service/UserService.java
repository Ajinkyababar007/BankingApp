package com.practice.practice.service;


import com.practice.practice.dto.UserDto;

import java.util.List;

public interface UserService {

    public UserDto getUserById(Long id);
    public List<UserDto> getAllUser();
    public UserDto updateUser(UserDto userDto);

    public UserDto createAccount(UserDto userDto);
}
