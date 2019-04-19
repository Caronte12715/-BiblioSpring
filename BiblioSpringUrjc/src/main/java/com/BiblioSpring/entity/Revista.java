package com.BiblioSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Revista {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRevista;
	@Column
	private String nombre;
	@Column
	private Integer numero;
	@Column
	private Integer ano;
	@OneToOne
	private Alternativa alternativa;

	public Long getIdRevista() {
		return idRevista;
	}

	public void setIdRevista(Long idRevista) {
		this.idRevista = idRevista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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
	public String toString() {
		return "Revista [nombre=" + nombre + ", numero=" + numero + ", ano=" + ano + "]";
	}

	public Revista(String nombre, Integer numero, Integer ano) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.ano = ano;
	}

	public Revista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int primo = 31; //porque es numero primo
		int resultado = 1; //valor aleatorio inicial
		resultado = primo * resultado + (int) (idRevista ^ (idRevista >>> 32));
		resultado = primo * resultado + ((nombre == null) ? 0 : nombre.hashCode());
		resultado = primo * resultado + ((ano == null) ? 0 : ano.hashCode());
		resultado = primo * resultado + ((numero == null) ? 0 : numero.hashCode());
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
			
		Revista otro = (Revista) obj;
		if (idRevista != otro.idRevista)
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
		if (numero == null) {
			if (otro.numero != null)
				return false;
		} else if (!numero.equals(otro.numero))
			return false;
		if (alternativa == null) {
			if (otro.alternativa != null)
				return false;
		} else if (!alternativa.equals(otro.alternativa))
			return false;
		
		return true;
	}

}
