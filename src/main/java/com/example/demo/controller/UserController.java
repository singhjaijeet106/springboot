package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

	@GetMapping(path = "/welcome")	
	public String welcome() {
		return "welcome to the new api endpoint";
	}

}
