package com.ypa.reactjsex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class JenkinsController {
	
	@GetMapping("/hello")
	
	public String getMessage()
	
	{
		System.out.println("inside getMessage "); 
		
		return "Hello Balaiah This is from Jenkins Guthub";
	}

}
