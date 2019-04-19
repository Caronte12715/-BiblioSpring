package com.BiblioSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contacto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idContacto;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String asunto;
	@Column
	private String comentario;

	

	public long getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(long idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
	public Contacto() {
		super();
	}

	public Contacto(String nombre, String correo, String asunto, String comentario) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.asunto = asunto;
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Contacto  nombre=" + nombre + ", correo=" + correo + ", asunto=" + asunto + ", comentario=" + comentario
				+ "]";
	}

	@Override
	public int hashCode() {
		final int primo = 31; //porque es numero primo
		int resultado = 1; //valor aleatorio inicial
		resultado = primo * resultado + (int) (idContacto ^ (idContacto >>> 32));
		resultado = primo * resultado + ((nombre == null) ? 0 : nombre.hashCode());
		resultado = primo * resultado + ((correo == null) ? 0 : correo.hashCode());
		resultado = primo * resultado + ((asunto == null) ? 0 : asunto.hashCode());
		resultado = primo * resultado + ((comentario == null) ? 0 : comentario.hashCode());
		
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
			
		Contacto otro = (Contacto) obj;
		if (idContacto != otro.idContacto)
			return false;
		if (nombre == null) {
			if (otro.nombre != null)
				return false;
		} else if (!nombre.equals(otro.nombre))
			return false;
		if (correo == null) {
			if (otro.correo != null)
				return false;
		} else if (!correo.equals(otro.correo))
			return false;
		if (asunto == null) {
			if (otro.asunto != null)
				return false;
		} else if (!asunto.equals(otro.asunto))
			return false;
		if (comentario == null) {
			if (otro.comentario != null)
				return false;
		} else if (!comentario.equals(otro.comentario))
			return false;
		
		return true;
	}
}
