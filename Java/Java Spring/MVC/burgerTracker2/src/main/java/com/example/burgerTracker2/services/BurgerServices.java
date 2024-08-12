package com.example.burgerTracker2.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.burgertracker.burgertracker.models.Burger;
import com.burgertracker.burgertracker.repositories.BurgerRepository;

@Service
public class BurgerService {
    private BurgerRepository burgerRepository;
    


	public BurgerService(BurgerRepository burgerRepository) {
		super();
		this.burgerRepository = burgerRepository;
	}

	public List<Burger> findAll() {
        return burgerRepository.findAll();
    }

    public void save(Burger burger) {
        burgerRepository.save(burger);
    }

	public Burger findBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepository.findById(id);
		if(optionalBurger.isPresent()) {
			return optionalBurger.get();
		}else {
			return null;
		}
	}
	
	public Burger updateBurger(Burger burger) {
		return burgerRepository.save(burger);
	}
}
}
