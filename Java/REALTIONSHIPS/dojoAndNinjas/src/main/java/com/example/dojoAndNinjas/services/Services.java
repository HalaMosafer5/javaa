package com.example.dojoAndNinjas.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldojdningas.dojdningas.models.Dojo;
import com.ldojdningas.dojdningas.repositories.DojoRepository;

import java.util.List;

@Service
public class Services {
    @Autowired
    private DojoRepository dojoRepository;

    public List<Dojo> getAllDojos() {
        return dojoRepository.findAll();
    }

    public Dojo getDojoById(Long id) {
        return dojoRepository.findById(id).orElse(null);
    }

    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }
}