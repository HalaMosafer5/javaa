package com.example.languages.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LanguageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String creator;

    @Column(nullable = false, length = 10)
    private String version;
    
    public LanguageModel() {
		// TODO Auto-generated constructor stub
	}
    
    

	public LanguageModel(String name, String creator, String version) {
		super();
		this.name = name;
		this.creator = creator;
		this.version = version;
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name + ", creator=" + creator + ", version=" + version + "]";
	}

  
}
