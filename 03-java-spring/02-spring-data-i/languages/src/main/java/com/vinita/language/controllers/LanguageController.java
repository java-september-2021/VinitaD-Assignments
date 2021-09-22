package com.vinita.language.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinita.language.models.Language;
import com.vinita.language.services.LanguageService;

@Controller
@RequestMapping("/language")
public class LanguageController {
	private LanguageService lService;

	public LanguageController(LanguageService lService) {
		this.lService = lService;
	}
	
	@GetMapping("")
	public String newLanguage(Model myModel, @ModelAttribute("language") Language language) {
		
		myModel.addAttribute("allLang",this.lService.allLang());
		
		return "new.jsp";
	}
	
	@PostMapping("")
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
            return "new.jsp";
        } else {
            lService.createLang(language);
            return "redirect:/language";
        }
	}
	//for edit and update
	
	@GetMapping(value = "/{id}/edit")
	public String editPage(@PathVariable("id") Long id, Model myModel, @ModelAttribute("language") Language language) {
		Language targetLang = this.lService.getLang(id);
		System.out.println(targetLang);
		myModel.addAttribute("language", targetLang);
		return "edit.jsp";
	}
	@RequestMapping(value="/{id}/edit", method=RequestMethod.PUT)
	public String updatePage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("I AM ERRORS");
			//myModel.addAttribute("lang", targetLang);
           return "edit.jsp";
        } else {
        	lService.updateLang(language);
        	System.out.println("I AM UPDate");
            return "redirect:/language";
        }	
	}
	
	//delete a language
	@DeleteMapping("/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
        lService.destroy(id);
        return "redirect:/language";
    }
	
	//show a language
	@GetMapping("/{id}")
	public String info(@PathVariable("id") Long id, Model myModel) {
		Language targetLang = this.lService.getLang(id);
		System.out.println(targetLang);
		myModel.addAttribute("lang", targetLang);
		return "show.jsp";
	}
		
	
}
