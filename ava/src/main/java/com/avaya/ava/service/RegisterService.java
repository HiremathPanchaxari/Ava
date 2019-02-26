package com.avaya.ava.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.avaya.ava.dto.AlexaMessage;
import com.avaya.ava.dto.RegisterDto;


@Service
public class RegisterService {
	private static RestTemplate restTemplate;
	static {
		restTemplate = new RestTemplate();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String registerUser(RegisterDto registerDto) {
		return AlexaMessage.RegistrationSuccess;
	}
}
