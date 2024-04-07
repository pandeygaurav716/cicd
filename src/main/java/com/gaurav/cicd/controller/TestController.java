package com.gaurav.cicd.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("name")
	public ResponseEntity<String> getMyName(){
		return new ResponseEntity<String>("Gaurav", HttpStatusCode.valueOf(200));
	}
}
