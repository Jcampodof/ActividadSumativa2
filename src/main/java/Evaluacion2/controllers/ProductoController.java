package Evaluacion2.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
	
	private static final int PAGE_SIZE = 4;
	
	
	@RequestMapping("")
	public String inicioProducto(HttpSession session, Model model) {
	
		Integer registrado = (Integer) session.getAttribute("registrado");
		if (registrado==1) {
			List<Producto> listaProductos = prodService.findAll();
			model.addAttribute("listaProductos",listaProductos);
			//model.addAttribute("listaProductos", prodService.productosPages(0));
			
			Page<Producto> productos = prodService.productosPages(0, PAGE_SIZE);
			
			int totalPaginas = productos.getTotalPages();
			model.addAttribute("totalPaginas", totalPaginas);
			model.addAttribute("productos", productos);
			
			
			return "productos.jsp";
		}
		else {
			return "index.jsp";
		}
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
			HttpSession session, Model model) {
		Producto prod = prodService.findById(id);
		
		List<Categoria> listaCategorias = categService.findAll();
		
		model.addAttribute("producto", prod);
		model.addAttribute("listaCategorias" ,listaCategorias);
		
		return "editproducto.jsp";
	}
	
	@RequestMapping("/update")
	public String updateProd(@ModelAttribute("producto") Producto prod,
			HttpSession session) {
		prodService.save(prod);
		return "redirect:/productos";
	}
	
	@RequestMapping("eliminar/{id}")
	public String deleteProd(@PathVariable("id") Long id, HttpSession session) {
		prodService.deleteProd(id);
		return "redirect:/productos";
	}
	
	/*
	 * Paginación
	 */
	@RequestMapping("/pagina/{numeroPagina}")
	public String getProductosPagina(@PathVariable("numeroPagina")  int numeroPagina,
			Model model) {
			//Las paginas iterables empiezan en 0 en el Backend pero en Front, parten de 1
		Page<Producto> productos = prodService.productosPages(numeroPagina-1, PAGE_SIZE);
		int totalPaginas = productos.getTotalPages();
		model.addAttribute("totalPagina", totalPaginas);
		model.addAttribute("productos", productos);
		
		return "productos.jsp";
	}
	

}
