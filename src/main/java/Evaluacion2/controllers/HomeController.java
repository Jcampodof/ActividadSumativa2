package Evaluacion2.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Evaluacion2.models.Usuario;
import Evaluacion2.services.LoginService;

@Controller
public class HomeController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.invalidate();
		//session.setAttribute("registrado", 0);
		return "index.jsp";
	}
	
/*	@RequestMapping("")
	public String registro(@Valid @ModelAttribute("usuario") Usuario usuario) {
		
		
		return "";
	}*/
	
	/*@RequestMapping("/login")
	public String login(@RequestParam("email") String email,
			@RequestParam("pass") String pass) 
	{
		Login login = new Login();
		login.setEmail(email);
		login.setPassword(pass);
		
		loginService.registrar(login);
		return "redirect:/productos";
	}*/
}
