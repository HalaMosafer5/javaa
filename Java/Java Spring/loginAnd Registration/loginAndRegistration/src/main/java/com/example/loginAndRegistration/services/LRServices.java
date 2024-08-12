package com.example.loginAndRegistration.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.loginregistration.loginregistration.models.LoginUser;
import com.loginregistration.loginregistration.models.User;
import com.loginregistration.loginregistration.repositories.UserRepository;

@Service
public class LRServices {
	
	@Autowired
    private UserRepository userRepo;
	
    public User register(User newUser, BindingResult result) {
       
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	
    	if(potentialUser.isPresent()) {
    		result.rejectValue("email", "Matches", "An account with that email already exists!");
    	}
    	
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	
    	if(result.hasErrors()) {
    		return null;
    	}
    
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	return userRepo.save(newUser);
    	
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
    	
    	Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        
    	if(!potentialUser.isPresent()) {
    		result.rejectValue("email", "Matches", "User not found!");
    		return null;
    	}
    	
    	User user = potentialUser.get();
        
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}
    	
    	if(result.hasErrors()) {
    		return null;
    	}
    	
        return user;
    }
    
    public User findById(Long id) {
    	Optional<User> potentialUser = userRepo.findById(id);
    	if(potentialUser.isPresent()) {
    		return potentialUser.get();
    	}
    	return null;
    }

}
