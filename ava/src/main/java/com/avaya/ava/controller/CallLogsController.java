package com.avaya.ava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaya.ava.service.CallLogsService;

@RestController
@RequestMapping("/calllogs")
public class CallLogsController {

    @Lazy
    @Autowired
	private CallLogsService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAllCallLogs() {
		return ResponseEntity.ok().body(service.getCallLogs());
	}
}
