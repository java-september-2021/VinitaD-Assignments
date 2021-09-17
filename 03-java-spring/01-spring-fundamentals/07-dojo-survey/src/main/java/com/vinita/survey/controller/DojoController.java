package com.vinita.survey.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vinita.survey.models.Survey;

@Controller
public class DojoController {
	@RequestMapping("/")
	public String home(Model myModel) {
		myModel.addAttribute("locations", new String[]{"Chicago", "Seattle", "San Hose", "LA"});
		myModel.addAttribute("languages",new String[] {"Java", "Python", "Ruby", "Mern"});
		return "index.jsp";
	}
		
		
	@RequestMapping(value = "/process")
	public String process(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, HttpSession session) {
//		if(language.equals("Java")) {
//			language= language +" " + "<a href='/java'>click to another page</a>";
//		}
		session.setAttribute("result", new Survey(name, language,location, comment));
		
	
	return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String dojo(Model mymodel, HttpSession session) {
		mymodel.addAttribute("result",session.getAttribute("result"));
		
		return "dojo.jsp";
	}
	@RequestMapping(value = "/java")
	public String javaPage() {
		return "java.jsp";
	}
	

}
