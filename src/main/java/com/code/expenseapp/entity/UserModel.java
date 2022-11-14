package com.code.expenseapp.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserModel {

    @NotBlank(message = "Name should not be empty")
    private String name;

    @NotBlank(message = "Email should not be empty")
    @Email(message = "Enter a valid email")
    private String email;

    @NotBlank(message = "Password should not empty")
    @Size(min = 5, message = "Password should be atleast 5 characters")
    private String password;

    private Long age = 0L;
}