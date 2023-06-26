package com.example.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GeetingsController {
    @RequestMapping("/")
	public String index() {
		return "Greetings from TAP & Spring, Iterate here!";
	}

}

@RestController
public class HelloController {
    @RequestMapping("/hello")
	public String index() {
		return "Hello there!";
	}

}