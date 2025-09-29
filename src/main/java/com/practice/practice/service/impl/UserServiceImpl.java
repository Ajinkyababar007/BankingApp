package com.practice.practice.service.impl;

import com.practice.practice.dto.UserDto;
import com.practice.practice.entity.User;
import com.practice.practice.repository.UserRepo;
import com.practice.practice.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public UserDto getUserById(Long id) {
        User users = userRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid ID" + id));
        return modelMapper.map(users, UserDto.class);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> allUsers = userRepo.findAll();
       /* List<UserDto> dtos = allUsers.stream()
                .map(UserDto::new)
                .collect(Collectors.toList());*/
       // return Collections.singletonList(modelMapper.map(allUsers, UserDto.class));
        //ModelMapper mapper = new ModelMapper();

        List<UserDto> dtos = allUsers.stream()
                .map(entity -> modelMapper.map(entity, UserDto.class))
                .collect(Collectors.toList());
        return dtos;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
       Optional<User> users = userRepo.findById(userDto.getAccountNumber());
       User user = users.get();
       /*user.setName(userDto.getName());
       user.setEmail(userDto.getEmail());
       user.setMobNumber(userDto.getMobNumber());*/
        modelMapper.map(userDto, user);
       User savedUser = userRepo.save(user);
       return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public UserDto createAccount(UserDto userDto) {
       User user = modelMapper.map(userDto, User.class);
       User savedUser = userRepo.save(user);
       return modelMapper.map(savedUser, UserDto.class);

    }


}
