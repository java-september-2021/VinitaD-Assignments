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

import com.vinita.dojoandninja.models.Ninja;
import com.vinita.dojoandninja.services.DojoService;
import com.vinita.dojoandninja.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	private NinjaService nService;
	@Autowired 
	private DojoService dService;
	
	@GetMapping("/ninja")
	public String newNinja(Model myModel, @ModelAttribute("ninja") Ninja ninja) {
		myModel.addAttribute("allDojo", this.dService.allDojo());
		return "/ninja/ninja.jsp";
	}
	
	@PostMapping("/ninja/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/ninja/ninja.jsp";
		}
		else {
			nService.createNinja(ninja);
			return "redirect:/dojo";
		}
	}
	
	//edit and update
	@GetMapping("/ninja/edit/{id}")
	public String editNinja(Model myModel, @ModelAttribute("ninja") Ninja ninja, @PathVariable("id") Long id) {
		myModel.addAttribute("ninja", this.nService.getNinja(id));
		myModel.addAttribute("allDojo", this.dService.allDojo());
		return "/ninja/edit.jsp";
	}
	
	@PostMapping("/ninja/edit/{id}")  //why it is not showing error messages
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model myModel,@PathVariable("id") Long id) {
		if(result.hasErrors()) {
			//myModel.addAttribute("ninja", this.nService.getNinja(id));
			myModel.addAttribute("allDojo", this.dService.allDojo());
			return "/ninja/edit.jsp";
		}
		else {
			nService.updateNinja(ninja);
			return "redirect:/dojo";
		}
	
	}
	//delete a ninjna
	@PostMapping("/ninja/delete/{id}")
	public String deleteNinja(@PathVariable("id") Long id) {
		this.nService.destroy(id);
		return "redirect:/dojo";
	}
	
}
