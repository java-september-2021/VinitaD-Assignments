package com.vinita.license.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinita.license.models.License;
import com.vinita.license.models.Person;
import com.vinita.license.services.LicenseService;
import com.vinita.license.services.PersonService;

@Controller
@RequestMapping("/license")
public class LicenseController {
	@Autowired
	private PersonService pService;
	@Autowired
	private LicenseService lService;
	
	@GetMapping("")
	public String newLicense(Model myModel,@ModelAttribute("license") License license) {
		List<Person> allPerson = this.pService.noLicense();
		myModel.addAttribute("allPerson", allPerson);
		return "/license/newLicense.jsp";
	}
	@PostMapping("/new") 
		public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "/license/newLicense.jsp";
		}
		this.lService.createLicense(license);
		return "redirect:/person";
		}
	}


