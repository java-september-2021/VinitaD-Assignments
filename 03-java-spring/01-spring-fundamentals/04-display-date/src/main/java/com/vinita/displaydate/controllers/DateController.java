package com.vinita.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	@RequestMapping("/")
	public String mainPage() {
		System.out.println("MASEEERFGHJKGCFHVJBKN");
		return "home.jsp";
	}
	
	@RequestMapping(value = {"/date"})
	public String date(Model myModel) {
		Date date = new Date();
		myModel.addAttribute("date",date);
		return "date.jsp";
	}
	
	@RequestMapping(value = {"/time"})
	public String time(Model myModel) {
		Date date = new Date();
		myModel.addAttribute("date",date);
		return "time.jsp";
	}
	
}
