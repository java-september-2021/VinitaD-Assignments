package com.vinita.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControl {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model myModel) {
		Integer currentCount = 0;
		// If the count is not already in session
		if (session.getAttribute("count") != null) {
			currentCount = (Integer) session.getAttribute("count");
		} 
		
		currentCount++;
		session.setAttribute("count", currentCount);
		myModel.addAttribute("countToShow", currentCount);
		
		return "index.jsp";

	}
	
	@RequestMapping(value = "/counter")
	public String counter(HttpSession session, Model model) { 
		Integer currentCounter = (Integer) session.getAttribute("count");
		model.addAttribute("count", currentCounter);
		return "counter.jsp";
	}
	
	@RequestMapping(value =  "/flush")
	public String flush(HttpSession session) {
		session.removeAttribute("count");
		return "redirect:/";
	}
	
	@RequestMapping(value = "/counter2")
	public String counter2(HttpSession session, Model myModel) {
		Integer count = 0;
		if (session.getAttribute("count") != null) {
			count = (Integer) session.getAttribute("count");
		} 
		
		count += 2;
		session.setAttribute("count", count);
		myModel.addAttribute("countToShow", count);
		
		return "counter2.jsp";

	}
	
	@RequestMapping(value =  "/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/counter2";
	}
	
	
}
	
	



