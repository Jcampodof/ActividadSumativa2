package Evaluacion2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Evaluacion2.models.Categoria;
import Evaluacion2.models.Producto;
import Evaluacion2.repositories.CategoriaRepository;
import Evaluacion2.services.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	ProductoService prodService;
	@Autowired
	CategoriaRepository categService;
	
	@RequestMapping("")
	public String inicioProducto(Model model) {
		List<Producto> listaProductos = prodService.findAll();
		model.addAttribute("listaProductos",listaProductos);
		return "productos.jsp";
		
	}
	
	@RequestMapping("/insertar")
	public String insertarProducto(@RequestParam("nombre") String name,
			@RequestParam("precio") String price,
			@RequestParam("descripcion") String description) {
		
		Producto prod = new Producto();
		prod.setName(name);
		prod.setPrice(Float.parseFloat(price));
		prod.setDescription(description);
		prod = prodService.save(prod);

		return "redirect:/productos";
	}
	
	@RequestMapping("editar/{id}")
	public String editProd(@PathVariable("id") Long id,
			Model model) {
		Producto prod = prodService.findById(id);
		
		List<Categoria> listaCategorias = categService.findAll();
		
		model.addAttribute("producto", prod);
		model.addAttribute("listaCategorias" ,listaCategorias);
		
		return "editproducto.jsp";
	}
	
	@RequestMapping("/update")
	public String updateProd(@ModelAttribute("producto") Producto prod) {
		prodService.save(prod);
		return "redirect:/productos";
	}
	
	@RequestMapping("eliminar/{id}")
	public String deleteProd(@PathVariable("id") Long id) {
		prodService.deleteProd(id);
		return "redirect:/productos";
	}
	
	

}
