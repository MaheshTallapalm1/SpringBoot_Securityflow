package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@GetMapping("/home")
	public String home()
	{
		return("Welcome to Sping Security Home");
		
	}
	@GetMapping("/balance")
	public String balance() {
		return ("My Account Balance is 9000.00");
	}
	@GetMapping("/lone")
	public String lone()
	{
		return ("this is ur lone Amount 8000.00");
	}
	@GetMapping("/statement")
	public String statement() {
		return ("thanks for ur contect of custmoer care");
		
	}
	@GetMapping("/contact")
	public String contact() {
		return ("thanks ur calling custmoer care");
	}

}
