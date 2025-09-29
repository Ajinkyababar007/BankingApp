package com.practice.practice.dto;

import com.practice.practice.entity.User;
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

    /*public UserDto(User user) {
        this.accountNumber = user.getAccountNumber();
        this.Name = user.getName();
        this.email = user.getEmail();
        this.mobNumber = user.getMobNumber();
    }*/
}
