package com.BiblioSpring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Alternativa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAlternativa;

	@Column (name = "alternativa")
	private String alternativa;
	
	@OneToOne
	private Fanzine fanzine;
	@OneToOne
	private Revista revista;
	@OneToOne
	private Pelicula pelicula;


	public Alternativa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alternativa(String alternativa) {
		super();
		this.idAlternativa = idAlternativa;
		this.alternativa = alternativa;
	}
	public long getIdAlternativa() {
		return idAlternativa;
	}
	public void setIdAlternativa(long idAlternativa) {
		this.idAlternativa = idAlternativa;
	}
	public String getAlternativa() {
		return alternativa;
	}
	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
	public Fanzine getFanzine() {
		return fanzine;
	}
	public void setFanzine(Fanzine fanzine) {
		this.fanzine = fanzine;
	}
	public Revista getRevista() {
		return revista;
	}
	public void setRevista(Revista revista) {
		this.revista = revista;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	@Override
	public String toString() {
		return "Alternativa [alternativa=" + alternativa + ", fanzine=" + fanzine + ", revista=" + revista
				+ ", pelicula=" + pelicula + "]";
	}
	
	@Override
	public int hashCode() {
		final int primo = 31; //porque es numero primo
		int resultado = 1; //valor aleatorio inicial
		resultado = primo * resultado + (int) (idAlternativa ^ (idAlternativa >>> 32));
		resultado = primo * resultado + ((alternativa == null) ? 0 : alternativa.hashCode());
		resultado = primo * resultado + ((fanzine == null) ? 0 : fanzine.hashCode());
		resultado = primo * resultado + ((revista == null) ? 0 : revista.hashCode());
		resultado = primo * resultado + ((pelicula == null) ? 0 : pelicula.hashCode());
		
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
			
		Alternativa otra = (Alternativa) obj;
		if (idAlternativa != otra.idAlternativa)
			return false;
		if (alternativa == null) {
			if (otra.alternativa != null)
				return false;
		} else if (!alternativa.equals(otra.alternativa))
			return false;
		if (fanzine == null) {
			if (otra.fanzine != null)
				return false;
		} else if (!fanzine.equals(otra.fanzine))
			return false;
		if (pelicula == null) {
			if (otra.pelicula != null)
				return false;
		} else if (!pelicula.equals(otra.pelicula))
			return false;
		if (revista == null) {
			if (otra.revista != null)
				return false;
		} else if (!revista.equals(otra.revista))
			return false;
		
		return true;
	}

}
