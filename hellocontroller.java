package com.bdqn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

	@RequestMapping("/hello")
	public String hello() {
		char i='张';
		int s=i;
		System.out.println(s);
		return "Hello World";
	
	}
}
