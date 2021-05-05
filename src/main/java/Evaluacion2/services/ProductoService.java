package Evaluacion2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Evaluacion2.models.Producto;
import Evaluacion2.repositories.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository prodRepository;
	
	public Producto save(Producto prod) {
		
		return prodRepository.save(prod);
	}
	
	public Producto findById(Long id) {
		return prodRepository.findById(id).get();
	}
	
	public List<Producto> findAll(){
		return prodRepository.findAll();
	}
	
	public void deleteProd(Long id) {
		prodRepository.deleteById(id);
	}

}
