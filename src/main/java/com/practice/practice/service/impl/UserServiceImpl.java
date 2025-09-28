package com.practice.practice.service.impl;

import com.practice.practice.dto.UserDto;
import com.practice.practice.entity.User;
import com.practice.practice.repository.UserRepo;
import com.practice.practice.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid ID" + id));
        return modelMapper.map(user, UserDto.class);
    }

    
}
