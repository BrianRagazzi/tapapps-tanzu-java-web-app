package com.example.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
	public String index() {
		return "Hello from TAP, Iterate <a href=/new >here</a> using Spring v3.1!";
	}

	@RequestMapping("/new")
	public String indexnewthing() {
		return "Here's a new thing";
	}

}
