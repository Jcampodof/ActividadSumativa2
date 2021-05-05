package Evaluacion2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Evaluacion2.models.Usuario;
import Evaluacion2.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("")
	public String inicioUsuario() {
		return "usuario.jsp";
	}
	
	@RequestMapping("/insertar")
	public String insertarUsuario(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password) {
		
		
		Usuario usuario = new Usuario();
		usuario.setName(name);
		usuario.setEmail(email);
		usuario.setPassword(password);
		usuario = usuarioService.save(usuario);
		return "redirect:/";
	}
}
