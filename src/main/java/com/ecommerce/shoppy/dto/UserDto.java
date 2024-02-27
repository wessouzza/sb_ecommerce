package com.ecommerce.shoppy.dto;

import com.ecommerce.shoppy.enums.UserRole;

public record UserDto(String username, String email, String password, String phone, String document, UserRole role){
    
}