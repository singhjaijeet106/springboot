package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserDetail;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

	@GetMapping(path = "/welcome")	
	public String welcome() {
		return "welcome to the new api endpoint";
	}
	
	@GetMapping(path = "/exit")	
	public String exit() {
		return "please visit us again soon";
	}

	public UserDetail getUserDetails() {
		return null;
	}
}
