package Evaluacion2.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String inicioCateg(HttpSession session, Model model) {
		Integer registrado = (Integer) session.getAttribute("registrado");
		if (registrado==1) {
			List<Categoria> listaCategorias = categService.findAll();
			model.addAttribute("listaCategorias", listaCategorias);
			return "categoria.jsp";
		}
		return "index.jsp";
	}
	
	@RequestMapping("/insertar")
	public String insertarCateg(@RequestParam("nombre") String nombre,
			HttpSession session) {
		Categoria categoria = new Categoria();
		categoria.setNombre(nombre);
		categoria = categService.save(categoria);
		return "redirect:/categoria";
	}
	
	
}
