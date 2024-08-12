package com.example.loginAndRegistration.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loginregistration.loginregistration.models.User;

@Repository
public interface LRRepositories extends CrudRepository<User, Long> {
 
	Optional<User> findByEmail(String email);
 
}