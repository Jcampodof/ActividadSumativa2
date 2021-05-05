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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=3, max=50)
	private String name;
	@Size(min=3, max=100)
	private String description;
	@Min(0)
	private float price;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@ManyToMany(fetch= FetchType.LAZY)
	@JoinTable(name="categoria_productos",
	joinColumns = @JoinColumn(name="producto_id"),
	inverseJoinColumns = @JoinColumn(name="categoria_id"))
	private List<Categoria> categorias;
	
	
	public Producto() {}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
}
