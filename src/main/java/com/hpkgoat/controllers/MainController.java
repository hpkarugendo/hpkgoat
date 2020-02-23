package com.hpkgoat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	public MainController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value={"/", "/home"})
	public String index(Model m) {
		m.addAttribute("messageFromServer", new String("This is a message from the server. Everything is working fine!"));
		return "index";
	}
	
	@GetMapping("/profile")
	public String profile(Model m) {
		m.addAttribute("title", "Profile");
		
		return "profile";
	}
	
	@GetMapping("/galleries")
	public String galleries(Model m) {
		m.addAttribute("title", "Galleries");
		
		return "galleries";
	}
	
	@GetMapping("/projects")
	public String projects(Model m) {
		m.addAttribute("title", "Projects");
		
		return "projects";
	}

}
