package com.example.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;


@Controller
public class CounterApplication {

    @RequestMapping("/")
    public String index(HttpSession session) {
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        session.setAttribute("counter", ++counter);
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model) {
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        model.addAttribute("counter", counter);
        return "counter.jsp";
    }

    @RequestMapping("/incrementByTwo")
    public String incrementByTwo(HttpSession session) {
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        session.setAttribute("counter", counter + 2);
        return "index.jsp";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session) {
        session.setAttribute("counter", 0);
        return "index.jsp";
    }
}