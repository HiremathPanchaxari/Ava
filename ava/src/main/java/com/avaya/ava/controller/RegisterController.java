package com.avaya.ava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaya.ava.dto.RegisterDto;
import com.avaya.ava.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Lazy
	@Autowired
	private RegisterService service;
	 
	 @RequestMapping(method = RequestMethod.POST)
	public String registerUser(@RequestBody RegisterDto registerDto) {
		String username = "Panchaxari";
		return service.registerUser(registerDto);
	}
}
