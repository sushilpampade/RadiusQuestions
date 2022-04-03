package com.sushil.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	
	@GetMapping(value = "/welcome")
	public String getWelcomeMessage() {
		return "welcome";
	}

}
