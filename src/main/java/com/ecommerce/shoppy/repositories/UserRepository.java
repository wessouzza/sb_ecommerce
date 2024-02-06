package com.ecommerce.shoppy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoppy.entities.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{
    
}