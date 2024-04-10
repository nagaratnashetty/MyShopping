package com.myshopping.MyShopping.service;

import com.myshopping.MyShopping.models.AppUser;
import com.myshopping.MyShopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    // To save a user we need repository layer

    @Autowired
    UserRepository userRepository;

    public void registerUser(AppUser user){
        // to save user in the database jpa is providing save method to us.
        userRepository.save(user);
        // by using this save method which is coming from jpa repository automatically our user kind of
        // object will get saved into sql database.
    }

    public AppUser getUserById(UUID id){
        AppUser user = userRepository.findById(id).orElse(null);
        return user;
    }
}