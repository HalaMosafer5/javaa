package com.example.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class MainController {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String name) {
        if(name==null){
			return "Hello Human";
		}
		return "Hello " + name;
    }


}
