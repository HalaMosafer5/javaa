package com.example.displaydate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DisplaydateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplaydateApplication.class, args);
	}
	@RequestMapping("date")
    public String date(){
    	return "";
    }

	@RequestMapping("time")
    public String time(){
    	return "";
    }
}
