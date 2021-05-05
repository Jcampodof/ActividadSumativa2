package Evaluacion2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Evaluacion2.models.Categoria;
import Evaluacion2.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	CategoriaRepository categRepository;
	
	public Categoria save(Categoria categoria) {
		return categRepository.save(categoria);
	}

	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return categRepository.findAll();
	}


}
