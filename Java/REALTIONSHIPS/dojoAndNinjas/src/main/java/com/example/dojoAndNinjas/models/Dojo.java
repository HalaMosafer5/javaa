package com.example.dojoAndNinjas.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "dojo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Ninja> ninjas;

    public Dojo() {
		// TODO Auto-generated constructor stub
	}

	public Dojo(String name, List<Ninja> ninjas) {
		super();
		this.name = name;
		this.ninjas = ninjas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ninja> getNinjas() {
		return ninjas;
	}

	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}

	@Override
	public String toString() {
		return "Dojo [id=" + id + ", name=" + name + ", ninjas=" + ninjas + "]";
	}
    
    
}
