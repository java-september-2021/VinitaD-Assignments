package com.vinita.hello.human.name;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Human {
	
	@RequestMapping("/")
	public String human(@RequestParam(value="name", required=false, defaultValue="Human") String name, Model model) {
		
		model.addAttribute("name", name);
		return "index.jsp";
	}
}
