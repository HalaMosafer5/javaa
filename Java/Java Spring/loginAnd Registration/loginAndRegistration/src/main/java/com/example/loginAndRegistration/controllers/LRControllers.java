package com.example.loginAndRegistration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.loginregistration.loginregistration.models.LoginUser;
import com.loginregistration.loginregistration.models.User;
import com.loginregistration.loginregistration.services.UserService;


import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@org.springframework.stereotype.Controller
public class LRControllers {
	
	@Autowired
	private UserService userServ;
	
	@GetMapping("/")
	public String index(Model model) {
	 
	    model.addAttribute("newUser", new User());
	    model.addAttribute("newLogin", new LoginUser());
	    return "index.jsp";
	    
	}
	 
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
	     
		User user = userServ.register(newUser, result);
		
	    if(result.hasErrors()) {
	        // Be sure to send in the empty LoginUser before re-rendering the page.
	        model.addAttribute("newLogin", new LoginUser());
	        return "index.jsp";
	    }
	    
	    session.setAttribute("userId", user.getId());
	 
	    return "redirect:/welcome";
	}
	 
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
	     
		User user = userServ.login(newLogin, result);
	 
	    if(result.hasErrors() || user==null) {
	        model.addAttribute("newUser", new User());
	        return "index.jsp";
	    }
	     
	    session.setAttribute("userId", user.getId());
	 
	    return "redirect:/welcome";
	}
	
	@GetMapping("/welcome")
	public String welcome(HttpSession session, Model model) {
	 
		
		if(session.getAttribute("userId") == null) {
			return "redirect:/logout";
		}
		
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userServ.findById(userId));
		
	    return "welcome.jsp";
	    
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userId", null);
	     
	    return "redirect:/";
	}
	
}