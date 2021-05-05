package Evaluacion2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Evaluacion2.models.Carrito;
import Evaluacion2.services.CarritoService;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

	@Autowired
	CarritoService carrService;
	
	@RequestMapping("")
	public String inicioCarr(Model model) {
		List<Carrito> listaCarrito = carrService.findAll();
		model.addAttribute("listaCarrito",listaCarrito);
		return "carro.jsp";
	}
	
	@RequestMapping("/insertar/{id}/{name}/{description}/{price}")
	public String insertarCarr(@PathVariable("id") Long id,
			@PathVariable("name") String name,
			@PathVariable("description") String description,
			@PathVariable("price") String price) {
		
		Carrito carro = new Carrito();
		carro.setName(name);
		carro.setDescription(description);
		carro.setPrice(Float.parseFloat(price));
		
		carro = carrService.save(carro);
		
		return "redirect:/productos";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String deleteCarr(@PathVariable("id") Long id) {
		carrService.deleteCarr(id);
		return "redirect:/carrito";
	}
	
	@RequestMapping("/vaciar")
	public String vaciarCarr() {
		carrService.deleteAll();
		return "redirect:/carrito";
	}
}
