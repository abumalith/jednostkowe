package rik.testy.jednostkowe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import rik.testy.jednostkowe.calc.Calculator;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("chuj", Calculator.dodaj(10d, 8.5));
		
		return "index";
	}

}
