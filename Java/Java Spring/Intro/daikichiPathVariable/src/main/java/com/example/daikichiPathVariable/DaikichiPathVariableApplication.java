package com.example.daikichiPathVariable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DaikichiPathVariableApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariableApplication.class, args);
	}
	@RequestMapping(value="/daikichi/travel/{city}", method=RequestMethod.GET)
    public String showLesson(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to " + city + "!";
    }

	@RequestMapping(value="/daikichi/lotto/{number}", method=RequestMethod.GET)
    public String showLesson(@PathVariable("number") Integer number){
		if(number %2==0){
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
    	return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }


}
