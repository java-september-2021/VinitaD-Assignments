package com.vinita.overflow.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vinita.overflow.models.Answer;
import com.vinita.overflow.models.Question;
import com.vinita.overflow.models.User;
import com.vinita.overflow.services.AnswerService;
import com.vinita.overflow.services.QuestionService;
import com.vinita.overflow.services.TagService;
import com.vinita.overflow.services.UserService;

@Controller
public class HomeControllers {
	@Autowired
	public UserService uService;
	@Autowired
	public TagService tService;
	@Autowired
	public QuestionService qService;
	@Autowired
	public AnswerService aService;
	
	//go to root route
		@GetMapping("/")
		public String getUser(Model myModel,@ModelAttribute("user") User user) {
			myModel.addAttribute("allUser", this.uService.getAllUser());
			System.out.println(this.uService.getAllUser());
			return "user.jsp";
		}
		@PostMapping("/user/new")
	    public String createUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
	        if (result.hasErrors()) {
	            return "user.jsp";
	        } else {
	            this.uService.createProduct(user);
	            return "redirect:/";
	        }
	     
	    }
		
		//tologin and logout
		@PostMapping("/login")
		public String userToLogin(@RequestParam("userToLog") Long id, HttpSession session) {
			session.setAttribute("user__id", id); //setting id to session 
			return "redirect:/dashboard";
		}
		//tologout
		@GetMapping("/logout")
		public String logoutUser(HttpSession session) {
			session.invalidate();
			return "redirect:/";
		}
		
		@GetMapping("/dashboard")
		public String dashboard(Model myModel, HttpSession session) {
			if(session.getAttribute("user__id")== null) {
				return "redirect:/";
			}
			myModel.addAttribute("user", this.uService.getUser((Long)session.getAttribute("user__id")));
			myModel.addAttribute("questions", this.qService.getAllQuestion());
			return "dashboard.jsp";
		}
		
		// a new question
		@GetMapping("/question/new")
		public String newQuestion(@ModelAttribute("question") Question question) {
			return "new.jsp";
		}
		
		//create a question
		@PostMapping("/question/new")
		public String Create(@Valid @ModelAttribute("question") Question question, BindingResult result, RedirectAttributes redirectAttributes) { //RedirectAttributes redirectAttributes
//			if(session.getAttribute("user__id")== null) {
//				return "redirect:/";
//			}
			if(question.getTagFromForm().split(", ").length >3) {
				redirectAttributes.addFlashAttribute("errors", "You can add only three tags");
		        return "redirect:/question/new";
			}
			if(result.hasErrors()) {
				return "new.jsp";
			}
				
			this.qService.createQuestion(question);
			return "redirect:/dashboard";
		}
		
		@GetMapping("/question/{id}")
		public String answers(@PathVariable("id") Long id, Model myModel,@ModelAttribute("answer") Answer answer) {
			Question target = this.qService.getQuestion(id);
			myModel.addAttribute("question", target);
			return "show.jsp";
		}
		
		@PostMapping("/answer/{id}")
		public String createAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, @PathVariable("id") Long id) {
			if(result.hasErrors()) {
				return "show.jsp";
			}
			Question targetQ = this.qService.getQuestion(id);
			this.aService.createAnswer(answer, targetQ);
			return "redirect:/question/" + id;
		}

}
