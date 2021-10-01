package com.vinita.studentroster1.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinita.studentroster1.models.Contact;
import com.vinita.studentroster1.models.Student;
import com.vinita.studentroster1.services.ApiService;

@RestController
public class ApiController {
	@Autowired
	private ApiService aService;
	
	@PostMapping("/students/create")
	public  Student newStudent(Student student) {
		return this.aService.createStudent(student);
	}

	@PostMapping("/contacts/create")
	public String newContact(@Valid Contact contact, BindingResult result) {
		if(this.aService.haveContact().contains(contact.getStudent())) {
			result.hasErrors();
			return "redirect:/contacts";
		}
		
		this.aService.createContact(contact);
			return "contact has been created";
		}
	
	
	@GetMapping("/students")
	public List<Student> allStudents(){
		return this.aService.allStudent();
	}
}
