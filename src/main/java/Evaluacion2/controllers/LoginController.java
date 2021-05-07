package Evaluacion2.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Evaluacion2.models.Login;
import Evaluacion2.services.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("")
	public String login() {
		return "login.jsp";
	}
	
	@RequestMapping("/guardar")
	public String guardarLogin(@RequestParam("email") String email,
			@RequestParam("pass") String password
			) {
		Login login = new Login();
		login.setEmail(email);
		login.setPassword(password);
		
		loginService.registrar(login);
		
		return "redirect:/";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("email") String email,
			@RequestParam("pass") String password,
			Model model,
			HttpSession session) {
		
		//boolean respuesta = pService.autenticacion(email, password);
		
		if(loginService.autenticacion(email, password)) {
			session.setAttribute("email", email);
			session.setAttribute("registrado",1);//boolean
			session.setAttribute("contador",100);
			
			String mail = (String) session.getAttribute("email");
			Integer registrado = (Integer) session.getAttribute("registrado");
			Integer contador = (Integer) session.getAttribute("contador");
		
			System.out.println(mail+" - "+registrado+" - "+contador);
			
			model.addAttribute("registrado", true);			
			
			return "redirect:/productos";
		}else {
			session.removeAttribute("registrado");
			//session.invalidate();
			model.addAttribute("mensaje", "Datos erroneos");
			return "index.jsp";
		}
	}

}
