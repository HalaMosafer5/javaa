package com.example.burgerTracker.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.burgertracker.burgertracker.models.Burger;
import com.burgertracker.burgertracker.repositories.BurgerRepository;

@Service
public class services {
    private BurgerRepository burgerRepository;
    


	public services(BurgerRepository burgerRepository) {
		super();
		this.burgerRepository = burgerRepository;
	}

	public List<Burger> findAll() {
        return burgerRepository.findAll();
    }

    public void save(Burger burger) {
        burgerRepository.save(burger);
    }
}
}
