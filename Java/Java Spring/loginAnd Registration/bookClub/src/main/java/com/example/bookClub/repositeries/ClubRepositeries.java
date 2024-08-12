package com.example.bookClub.repositeries;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookclub.bookclub.models.User;

@Repository
public interface ClubRepositeries extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}