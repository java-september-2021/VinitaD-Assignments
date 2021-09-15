package com.vinita.code.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeControl {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping(value = {"/attempt"}, method=RequestMethod.POST)
	public String index(@RequestParam("code") String code , RedirectAttributes redirectAttributes) {
		if(code.equals( "bushido")){
			return "redirect:/code";
		}else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	@RequestMapping("/code")
	public String Code(Model model) {
		ArrayList<String> display = new ArrayList<String>(); 
		display.add("Loyalty");
		display.add("Courage");
		display.add("Veracity");
		display.add("Compassion");
		display.add("Honor");
		model.addAttribute("displayList", display);
		
		return "code.jsp";
	
	}

}
