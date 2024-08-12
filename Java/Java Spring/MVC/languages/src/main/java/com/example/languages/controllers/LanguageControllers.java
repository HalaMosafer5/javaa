package com.example.languages.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.languages.languages.models.Language;
import com.languages.languages.services.LanguageService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/languages")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping
    public String getAllLanguages(Model model) {
        model.addAttribute("languages", languageService.getAllLanguages());
        return "languages/index";
    }

    @GetMapping("/new")
    public String showNewLanguageForm(Model model) {
        model.addAttribute("language", new Language());
        return "languages/new";
    }

    @PostMapping
    public String saveLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "languages/new";
        }
        languageService.saveLanguage(language);
        return "redirect:/languages";
    }

    @GetMapping("/{id}")
    public String showLanguage(@PathVariable Long id, Model model) {
        Optional<Language> language = languageService.getLanguageById(id);
        if (language.isPresent()) {
            model.addAttribute("language", language.get());
            return "languages/show";
        } else {
            return "redirect:/languages";
        }
    }

    @GetMapping("/{id}/edit")
    public String showEditLanguageForm(@PathVariable Long id, Model model) {
        Optional<Language> language = languageService.getLanguageById(id);
        if (language.isPresent()) {
            model.addAttribute("language", language.get());
            return "languages/edit";
        } else {
            return "redirect:/languages";
        }
    }

    @PostMapping("/{id}")
    public String updateLanguage(@PathVariable Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "languages/edit";
        }
        language.setId(id);
        languageService.saveLanguage(language);
        return "redirect:/languages";
    }

    @PostMapping("/{id}/delete")
    public String deleteLanguage(@PathVariable Long id) {
        languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
}