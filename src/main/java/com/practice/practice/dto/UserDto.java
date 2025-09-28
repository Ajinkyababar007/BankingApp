package com.practice.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserDto {
    private Long accountNumber;
    private String Name;
    private String email;
    private Long mobNumber;
}
