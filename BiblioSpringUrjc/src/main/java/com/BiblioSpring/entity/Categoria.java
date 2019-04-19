package com.BiblioSpring.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	@Column(name = "area")
	private String area;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "categorias")
	private List<Libro> libros = new ArrayList<Libro>();

	/**
	 * 
	 */
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(String area) {
		super();
		this.area = area;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", area=" + area + ", libros=" + libros + "]";
	}
	
	@Override
	public int hashCode() {
		final int primo = 31; //porque es numero primo
		int resultado = 1; //valor aleatorio inicial
		resultado = primo * resultado + (int) (idCategoria ^ (idCategoria >>> 32));
		resultado = primo * resultado + ((area == null) ? 0 : area.hashCode());
		resultado = primo * resultado + ((libros == null) ? 0 : libros.hashCode());
		
		return resultado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
			
		Categoria otra = (Categoria) obj;
		if (idCategoria != otra.idCategoria)
			return false;
		if (area == null) {
			if (otra.area != null)
				return false;
		} else if (!area.equals(otra.area))
			return false;
		if (libros == null) {
			if (otra.libros != null)
				return false;
		} else if (!libros.equals(otra.libros))
			return false;
		
		return true;
	}
}
