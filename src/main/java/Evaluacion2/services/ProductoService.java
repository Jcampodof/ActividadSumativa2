package Evaluacion2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import Evaluacion2.models.Producto;
import Evaluacion2.repositories.ProductoRepository;

@Service
public class ProductoService {

	@Autowired
	ProductoRepository prodRepository;
	
	//private static final int PAGE_SIZE = 4;//cantidad de elementos por pagina
	
	public Page<Producto> productosPages(int numeroPagina, int cantPag){
		
		//obtener todos los productos y ordenarlos por nombre forma ascendente
		PageRequest pageRequest = PageRequest.of(numeroPagina, cantPag);
		
		return prodRepository.findAll(pageRequest);
		
	}
	
	
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
	
	/*public void querysJPQL() {
		//JPQL
		List<Producto> lista1 =prodRepository.findAllProductos();
		List<String> lista2 = prodRepository.findAllProductosNombres();
		List<Producto> lista3 = prodRepository.getProductoWhereId(2L);
		Producto prod= prodRepository.getSingleProductoWhereId(3L);
		//modificar
		int respuesta=prodRepository.setNombreForOne("Mouse", 2L);
		int respuesta2=prodRepository.setNombreForAll("Notebook");
		int respuesta3=prodRepository.deleteOneProducto(2L);
		
		/**
		 * Querys nativas

		
		List<Object[]> oProductos = productoRepository.findAllProductosWithfilter();
		Object[] vProducto = oProductos.get(0);//cargara el primer producto
		Object productoId= vProducto[0];
		Object productoNombre= vProducto[1];
		System.out.println(productoId+" - "+productoNombre);
	}*/

}
