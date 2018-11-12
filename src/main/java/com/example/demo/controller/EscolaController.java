package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EscolaController {
	
	@GetMapping(value="/")
	public String index(){
		return "index/index";
	}
	
	@GetMapping(value="/home")
	public String home(){
		return "home";
	}

}
