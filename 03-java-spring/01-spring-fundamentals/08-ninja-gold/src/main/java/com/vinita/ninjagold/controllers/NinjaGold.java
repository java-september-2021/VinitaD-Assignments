package com.vinita.ninjagold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGold {
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		if(session.getAttribute("totalGold") == null) {
			session.setAttribute("totalGold", 0);
		}
		ArrayList<String> activity = new ArrayList<String>(); //we are making a empty arraylist in case message is empty
		if(session.getAttribute("message") == null) {
			session.setAttribute("message", activity);
		}
		model.addAttribute("totalGold", session.getAttribute("totalGold"));
		model.addAttribute("messages", session.getAttribute("message"));
		return "index.jsp";
	}
	
	@PostMapping("/findgold") 
	public String findGold(@RequestParam("building") String building, HttpSession session) {
		int goldThisTurn;
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd Y h:mma");
		Random r = new Random();
		
		ArrayList<String> messages = (ArrayList<String>)session.getAttribute("message");
		if(building.equals("farm")) {
			System.out.println("hello");
			goldThisTurn = r.nextInt((20-10) + 1) + 10;
			messages.add(String.format("You entered a %s and earned %d gold, %s" , building ,goldThisTurn, formatter.format(now)));
		}
		else if(building.equals("cave")) {
			System.out.println("hello");
			goldThisTurn = r.nextInt((10-5) + 1) + 5;
			messages.add(String.format("You entered a %s and earned %d gold, %s" , building ,goldThisTurn, formatter.format(now)));
		}
		else if(building.equals("house")) {
			System.out.println("hello");
			goldThisTurn = r.nextInt((5-2) + 1) + 2;
			messages.add(String.format("You entered a %s and earned %d gold, %s" , building ,goldThisTurn, formatter.format(now)));
		}
		else if(building.equals("casino")) {
			System.out.println("hello");
			goldThisTurn = r.nextInt((50 + 50) + 1) -50;;
			if(goldThisTurn < 0) {
				messages.add(String.format("You Entered a %s and lost %d gold.ouch..., %s", building, goldThisTurn, formatter.format(now)));
			}else {
				messages.add(String.format("You entered a %s and earned %d gold, %s" , building ,goldThisTurn, formatter.format(now)));
			}
		} else {
		return "redirect:/";
	}
		int gold = (int)session.getAttribute("totalGold");
		int totalGold = gold += goldThisTurn;
		session.setAttribute("totalGold", totalGold);
		session.setAttribute("message", messages);
		return "redirect:/";
	}
}
