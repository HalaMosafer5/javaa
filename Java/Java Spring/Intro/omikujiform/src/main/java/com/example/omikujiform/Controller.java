package com.example.omikujiform;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/omikuji")
public class Controller {

    @GetMapping
    public String omikujiForm() {
        return "omikujiForm.jsp";
    }

    @PostMapping("/process")
    public String processOmikuji(HttpSession session, String number, String city, String person, String hobby, String livingThing, String compliment) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("compliment", compliment);
        return "redirect:/omikuji/omikujiShow.jsp";
    }

    @GetMapping("/show")
    public String showOmikuji(HttpSession session, Model model) {
        model.addAttribute("number", session.getAttribute("number"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("person", session.getAttribute("person"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("livingThing", session.getAttribute("livingThing"));
        model.addAttribute("compliment", session.getAttribute("compliment"));
        return "omikujiShow.jsp";
    }
}
