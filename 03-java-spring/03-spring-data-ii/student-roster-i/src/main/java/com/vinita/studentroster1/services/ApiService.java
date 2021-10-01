package com.vinita.studentroster1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinita.studentroster1.models.Contact;
import com.vinita.studentroster1.models.Student;
import com.vinita.studentroster1.repositories.ContactRepository;
import com.vinita.studentroster1.repositories.StudentRepository;

@Service
public class ApiService {
	@Autowired
	private ContactRepository cRepo;
	@Autowired
	private StudentRepository sRepo;
	
	//all methods for students
	//return allStudent
		public List<Student> allStudent(){
			return this.sRepo.findAll();
		}
		//return Student with  contact
		public List<Student> haveContact(){
			return this.sRepo.findByContactIsNotNull();
		}
		
		//create a Student
		public Student createStudent(Student student) {
			return this.sRepo.save(student);
		}
		
		//retrieve a Student
		public Student getStudent(Long id) {
			return this.sRepo.findById(id).orElse(null);
		}
		//update a Student
		public Student updateStudent(Student student) {
			return this.sRepo.save(student);
		}
		
		//delete a language
		public void destroy(Long id) {
			this.sRepo.deleteById(id);
		}
		//all methods for contact
		//return allContact
		public List<Contact> allContact(){
			return this.cRepo.findAll();
		}
		
		
		//create a Contact
		public Contact createContact(Contact contact) {
			return this.cRepo.save(contact);
		}
		
		//retrieve a Contact
		public Contact getContact(Long id) {
			return this.cRepo.findById(id).orElse(null);
		}
		//update a Contact
		public Contact updateContact(Contact contact) {
			return this.cRepo.save(contact);
		}
		
		//delete a language
		public void destroyContact(Long id) {
			this.cRepo.deleteById(id);
		}
}
