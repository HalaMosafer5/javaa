package com.example.dojoAndNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ldojdningas.dojdningas.models.Dojo;
import com.ldojdningas.dojdningas.services.DojoService;

@Controller
@RequestMapping("/dojos")
public class Controllers {
    @Autowired
    private DojoService dojoService;

    @GetMapping("/new")
    public String newDojo(Model model) {
        model.addAttribute("dojo", new Dojo());
        return "NewDojo.jsp";
    }

    @PostMapping("/new")
    public String createDojo(@ModelAttribute Dojo dojo) {
        dojoService.createDojo(dojo);
        return "redirect:/dojos/" + dojo.getId();
    }

    @GetMapping("/{id}")
    public String showDojo(@PathVariable Long id, Model model) {
        Dojo dojo = dojoService.getDojoById(id);
        model.addAttribute("dojo", dojo);
        return "showDojo.jsp";
    }
}

