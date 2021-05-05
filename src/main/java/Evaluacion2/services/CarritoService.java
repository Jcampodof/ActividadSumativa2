package Evaluacion2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Evaluacion2.models.Carrito;
import Evaluacion2.repositories.CarritoRepository;

@Service
public class CarritoService {
	@Autowired
	CarritoRepository carrRepository;
	
	public Carrito save(Carrito carr) {
		return carrRepository.save(carr);
	}
	
	public List<Carrito> findAll(){
		return carrRepository.findAll();
	}
	
	public void deleteCarr(Long id) {
		carrRepository.deleteById(id);
	}
	
	public void deleteAll() {
		carrRepository.deleteAll();
	}
	

}
