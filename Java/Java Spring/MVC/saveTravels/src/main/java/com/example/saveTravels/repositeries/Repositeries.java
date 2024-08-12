package com.example.saveTravels.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.savetravels.savetravels.models.Travel;

@Repository
public interface Repositeries extends JpaRepository<Travel, Long>  {
 
}
