package com.example.languages.services;

package com.languages.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.languages.languages.models.Language;
import com.languages.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    public Optional<Language> getLanguageById(Long id) {
        return languageRepository.findById(id);
    }

    public void saveLanguage(Language language) {
        languageRepository.save(language);
    }

    public void deleteLanguage(Long id) {
        languageRepository.deleteById(id);
    }
}