package com.bank.credyunion.model;

import java.io.Serializable;

public class UsuarioModel implements Serializable{
	
	private static final long serialVersionUID = -2170594781472174077L;
	
	private int idUsuario;
	private String nombreUsuario;
	private String contraseniaUsuario;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private boolean indicadorEliminacion;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseniaUsuario() {
		return contraseniaUsuario;
	}
	public void setContraseniaUsuario(String contraseniaUsuario) {
		this.contraseniaUsuario = contraseniaUsuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public boolean isIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(boolean indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
}
