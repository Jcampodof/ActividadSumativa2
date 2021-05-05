package Evaluacion2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("nombre") String nombre,
			@RequestParam("pass") String pass) {
		
		return "redirect:/productos";
	}
}
