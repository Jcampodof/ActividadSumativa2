package Evaluacion2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Evaluacion2.models.Usuario;
import Evaluacion2.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}

}
