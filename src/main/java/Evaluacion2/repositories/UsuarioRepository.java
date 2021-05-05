package Evaluacion2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Evaluacion2.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
