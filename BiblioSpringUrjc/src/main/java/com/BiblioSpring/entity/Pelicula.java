package com.BiblioSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pelicula{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPelicula;
	@Column
	private String nombre;
	@Column
	private Integer ano;
	@Column
	private String lugarPublicacion;
	@OneToOne
	private Alternativa alternativa;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(String nombre, Integer ano, String lugarPublicacion) {
		super();
		this.nombre = nombre;
		this.ano = ano;
		this.lugarPublicacion = lugarPublicacion;
	}

	@Override
	public String toString() {
		return "Fanzine [nombre=" + nombre + ", ano=" + ano +  ", lugarPublicacion="
				+ lugarPublicacion + "]";
	}


	public Long getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getLugarPublicacion() {
		return lugarPublicacion;
	}

	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Alternativa getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(Alternativa alternativa) {
		this.alternativa = alternativa;
	}

	@Override
	public int hashCode() {
		final int primo = 31; //porque es numero primo
		int resultado = 1; //valor aleatorio inicial
		resultado = primo * resultado + (int) (idPelicula ^ (idPelicula >>> 32));
		resultado = primo * resultado + ((nombre == null) ? 0 : nombre.hashCode());
		resultado = primo * resultado + ((ano == null) ? 0 : ano.hashCode());
		resultado = primo * resultado + ((lugarPublicacion == null) ? 0 : lugarPublicacion.hashCode());
		resultado = primo * resultado + ((alternativa == null) ? 0 : alternativa.hashCode());
		
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
			
		Pelicula otro = (Pelicula) obj;
		if (idPelicula != otro.idPelicula)
			return false;
		if (nombre == null) {
			if (otro.nombre != null)
				return false;
		} else if (!nombre.equals(otro.nombre))
			return false;
		if (ano == null) {
			if (otro.ano != null)
				return false;
		} else if (!ano.equals(otro.ano))
			return false;
		if (lugarPublicacion == null) {
			if (otro.lugarPublicacion != null)
				return false;
		} else if (!lugarPublicacion.equals(otro.lugarPublicacion))
			return false;
		if (alternativa == null) {
			if (otro.alternativa != null)
				return false;
		} else if (!alternativa.equals(otro.alternativa))
			return false;
		
		return true;
	}

}
