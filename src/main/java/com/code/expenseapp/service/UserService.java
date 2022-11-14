package com.code.expenseapp.service;

import com.code.expenseapp.entity.User;
import com.code.expenseapp.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);
}