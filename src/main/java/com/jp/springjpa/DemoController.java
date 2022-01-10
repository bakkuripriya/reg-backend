package com.jp.springjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String getMessage() {
		return "We are in Demo Api";
	}
	
	@GetMapping("/demo")
	public String getDemoMessage() {
		return "Demo Api with v1 version";
	}
	

}
