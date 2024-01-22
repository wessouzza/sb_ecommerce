package com.ecommerce.shoppy.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.shoppy.entities.UserModel;
import com.ecommerce.shoppy.repositories.UserRepository;

@Service
public class UserServiceImp implements UserService{
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserModel getOne(long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found."));
    }
}