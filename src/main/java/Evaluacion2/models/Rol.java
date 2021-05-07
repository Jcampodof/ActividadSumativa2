package Evaluacion2.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import Evaluacion2.models.Usuario;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="roles")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	//Muchos a muchos
/*	@ManyToMany(fetch= FetchType.LAZY)
	@JoinTable(name="usuarios_roles",	
	joinColumns = @JoinColumn(name="rol_id"),
	inverseJoinColumns = @JoinColumn(name="usuario_id"))*/
	//@ManyToMany(mappedBy="roles")
	//private List<Usuario> usuarios;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Rol() {}

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}*/
	
	
	
	
}
