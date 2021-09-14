package com.vinita.routing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/coding"})
public class CodingController {
	
	@RequestMapping(value = { "/", "" })
	public String coding() {
		
		return "Hello Coding Dojo!";
	}
	@RequestMapping(value = { "/python/", "/python" })
	public String python() {
		return "Python/Django was Awesoem!";
	}
	@RequestMapping(value = {"/java","/java/"})
	public String java() {
		return "Java/Spring is better";
	}

}
