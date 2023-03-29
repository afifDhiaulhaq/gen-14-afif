package net.javaguides.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VIewController {
	
	@Autowired
	CRUDService service;
	@GetMapping("/")
	public String home(Model model) {
		return"display";
	}
	
	
}
