package com.ecommerce.shoppy.services;

import java.util.List;

import com.ecommerce.shoppy.entities.UserModel;

public interface UserService {
    UserModel createUser(UserModel user);

    List<UserModel> getAllUsers();

    UserModel getOne(long id);
}

