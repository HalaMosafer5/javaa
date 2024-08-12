package com.example.languages.repositeries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LanguageRepositeries extends CrudRepository<Language, Long> {
	List<Language> findAll();
}