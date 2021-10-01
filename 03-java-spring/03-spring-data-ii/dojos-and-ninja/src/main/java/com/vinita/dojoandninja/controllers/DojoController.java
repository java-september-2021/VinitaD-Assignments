package com.vinita.dojoandninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vinita.dojoandninja.models.Dojo;
import com.vinita.dojoandninja.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dService;
	
	@GetMapping("/dojo")
	public String newDojo(Model myModel, @ModelAttribute("dojo") Dojo dojo) {
		myModel.addAttribute("locations",this.dService.allDojo());
		return "/dojo/dojo.jsp";
	}
	
	@PostMapping("/dojo/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
            return "/dojo/dojo.jsp";
        } else {
            dService.createDojo(dojo);
            return "redirect:/dojo";
        }
	}
	@GetMapping("/dojo/show/{id}")
	public String showDetails(@PathVariable("id") Long id, Model myModel) {
		myModel.addAttribute("dojo", this.dService.getDojo(id));
		return "/dojo/show.jsp";
	}
}
