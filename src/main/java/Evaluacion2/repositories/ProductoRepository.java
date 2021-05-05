package Evaluacion2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Evaluacion2.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
