package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.ServiceTest;

@Controller
public class EscolaController {
	
	@Autowired
	ServiceTest serviceTest;
	
	@GetMapping(value="/")
	public String index(HttpSession session, Model model){
		session.setAttribute("pemissions", "All Permissions");
		model.addAttribute("ServiceTest", serviceTest);
		return "index/index";
	}
	
	@GetMapping(value="/home")
	public String home(){
		return "home";
	}

}
