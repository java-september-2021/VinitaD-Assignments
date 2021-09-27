package com.vinita.license.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinita.license.models.Person;
import com.vinita.license.services.PersonService;

@Controller
@RequestMapping(value="/person")
public class PersonController {
	@Autowired
	private PersonService pService;
//	@Autowired
//	private LicenseService lService;
	
	@GetMapping("")
	public String index(Model myModel,@ModelAttribute("person") Person person) {
		List<Person> allPerson = this.pService.allPerson();
		myModel.addAttribute("allperson", allPerson);
		
		return "/person/new.jsp";
	}
	
	//create a person
	@PostMapping("/new")
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/person/new.jsp";
		}
		this.pService.createPerson(person);
		return "redirect:/person";
	}
	
	//edit a person
	@GetMapping("/edit/{id}")
	public String editPerson(@PathVariable("id") Long id, Model myModel, @ModelAttribute("person") Person person) {
		myModel.addAttribute("person", this.pService.getPerson(id));
		return "/person/edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String updatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result, @PathVariable("id") Long id, Model myModel) {
		if(result.hasErrors()) {
			myModel.addAttribute("person", this.pService.getPerson(id));
			return "/person/edit.jsp";
		}
		System.out.println("ccccccccccccccccccccccccc");
		this.pService.updatePerson(person);
		return "redirect:/person";
	}
	
	//delete a person
	@PostMapping("/delete/{id}")
	public String deletePerson(@PathVariable("id") Long id) {
		this.pService.destroy(id);
		return "redirect:/person";
	}
	
	//show detail of a person
	@GetMapping("/show/{id}")
	public String showDetail(@PathVariable("id") Long id, Model myModel) {
		myModel.addAttribute("person",this.pService.getPerson(id));
		return "/person/show.jsp";
	}
}
