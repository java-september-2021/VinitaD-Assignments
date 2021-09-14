package com.vinita.routing.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/dojo"})
public class DojoController {
	@RequestMapping(value = {"","/"})
	public String dojo() {
		return "Dojo is Awesome";
	}
	@RequestMapping(value = {"/{location}", "/{location}/"})
	public String dojoLocation(@PathVariable("location") String location) {
		if(location.equals("burbank")) {
			return "'Burbank Dojo is located in Southern California'";
		} else if (location.equals("san-jose")) {
			return "'SJ dojo is the headquarters'.";
		} else
			return "All is cool";
		
	}
}


