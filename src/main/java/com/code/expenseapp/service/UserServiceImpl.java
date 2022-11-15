package com.code.expenseapp.service;

import com.code.expenseapp.entity.User;
import com.code.expenseapp.entity.UserModel;
import com.code.expenseapp.exceptions.ItemAlreadyExistsException;
import com.code.expenseapp.exceptions.ResourceNotFoundException;
import com.code.expenseapp.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserModel user) {
        if(userRepository.existsByEmail(user.getEmail())) {
            throw new ItemAlreadyExistsException("User is already register with email: " + user.getEmail());
        }

        User newUser = new User();
        BeanUtils.copyProperties(user, newUser);
        return userRepository.save(newUser);
    }

    @Override
    public User readUser(Long id) {
       return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found for the id: " + id));
    }
}