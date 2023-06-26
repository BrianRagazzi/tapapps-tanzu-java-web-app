package com.example.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
	public String index() {
		return "Greetings from TAP, Iterate <a href=/new >here</a> using Spring v3.1!";
	}

}
/* 
@RestController
public class MyNewController {
    @RequestMapping("/new")
	public String index() {
		return "Here's a new thing";
	}

}  */