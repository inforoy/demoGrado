package com.bank.credyunion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = -2170594781472174077L;
	
	private int idUsuario;
	private String nombreUsuario;
	private String contraseniaUsuario;
	private String nombres;
	private String apellidos;
	private boolean indicadorEliminacion;
	
//	@Id
//	@Column(name = "id_usuario", unique = true, nullable = false)
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
//	@Column(name = "usuario", unique = true, nullable = false)
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
//	@Column(name = "contrasenia", unique = true, nullable = false)
	public String getContrasenia() {
		return contraseniaUsuario;
	}
	public void setContrasenia(String contrasenia) {
		this.contraseniaUsuario = contrasenia;
	}
	
//	@Column(name = "nombres", unique = true, nullable = false)
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
//	@Column(name = "apellidos", unique = true, nullable = false)
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
//	@Column(name = "indicador_eliminacion", unique = true, nullable = false)
	public boolean isIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(boolean indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
}
