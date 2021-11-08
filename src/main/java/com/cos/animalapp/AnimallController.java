package com.cos.animalapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimallController {
	
	@GetMapping("/")
	public String home() {
		return "home"; 
	}
	
}
