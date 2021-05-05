package Evaluacion2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Evaluacion2.models.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long>{

}
