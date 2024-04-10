package com.myshopping.MyShopping.repository;

import com.myshopping.MyShopping.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

// This repository layer is going to deal with AppUserTable
// We not need to write any kind of logic for database related operation for AppUserTable
// Jpa is going to handle it.

@Repository
public interface UserRepository extends JpaRepository<AppUser, UUID> {
    public List<AppUser> findByEmail(String email);

}