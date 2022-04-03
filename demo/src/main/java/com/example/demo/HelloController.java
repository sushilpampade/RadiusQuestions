package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public List<String> hello() {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		return list;
	}

}
