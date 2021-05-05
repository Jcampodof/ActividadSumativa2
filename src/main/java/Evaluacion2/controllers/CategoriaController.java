package Evaluacion2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Evaluacion2.models.Categoria;
import Evaluacion2.services.CategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	CategoriaService categService;
	
	@RequestMapping("")
	public String inicioCateg() {
		return "categoria.jsp";
	}
	
	@RequestMapping("/insertar")
	public String insertarCateg(@RequestParam("nombre") String nombre) {
		Categoria categoria = new Categoria();
		categoria.setNombre(nombre);
		categoria = categService.save(categoria);
		return "redirect:/categoria";
	}
}
