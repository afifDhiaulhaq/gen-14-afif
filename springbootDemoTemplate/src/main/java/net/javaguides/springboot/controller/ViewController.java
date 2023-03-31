package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.javaguides.springboot.entity.Company;
import net.javaguides.springboot.service.CompanyService;

@Controller
public class ViewController {
	@Autowired
	CompanyService service;
	@GetMapping("/")
	public String home(Model model) {
		return "display";
	}

	
}
