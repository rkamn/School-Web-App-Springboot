package com.lightbits.userlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lightbits.userlogin.model.User;

@Controller
public class IndexController {

	/*
	@GetMapping({"/"})
	public String hello(@RequestParam(value="name",
	defaultValue ="World", required=true ) String name, Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		return "login";
	}
	*/
	
	
	
	@GetMapping("/")
	public String login(Model model) {
		
		model.addAttribute("userForm",new User());	
		return "index";
	}
	
	
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user, Model model) {
		
		System.out.println(user.toString());
		model.addAttribute("userForm",new User());	
		model.addAttribute("message", "You have registered sucessfully... ");
		return "welcome";
	}
		
	

}
