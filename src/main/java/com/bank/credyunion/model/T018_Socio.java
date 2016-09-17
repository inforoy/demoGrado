package com.bank.credyunion.model;

import java.io.Serializable;
import java.util.Date;

public class T018_Socio implements Serializable {

	private static final long serialVersionUID = -5445891723271292073L;
	private String idSocio;
	private String idAgencia;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String numeroDni;
	private Date fechaDeIngreso; 
	private Date fechaDeNacimiento;
	private String telefonoMovilUno;
	private String telefonoMovilDos;
	private String telefonoFijo;
	private String correoElectronicoUno;
	private String correoElectronicoDos;
	private String indicadorEliminacion;
	
	public String getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}
	public String getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
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
	public String getNumeroDni() {
		return numeroDni;
	}
	public void setNumeroDni(String numeroDni) {
		this.numeroDni = numeroDni;
	}
	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getTelefonoMovilUno() {
		return telefonoMovilUno;
	}
	public void setTelefonoMovilUno(String telefonoMovilUno) {
		this.telefonoMovilUno = telefonoMovilUno;
	}
	public String getTelefonoMovilDos() {
		return telefonoMovilDos;
	}
	public void setTelefonoMovilDos(String telefonoMovilDos) {
		this.telefonoMovilDos = telefonoMovilDos;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public String getCorreoElectronicoUno() {
		return correoElectronicoUno;
	}
	public void setCorreoElectronicoUno(String correoElectronicoUno) {
		this.correoElectronicoUno = correoElectronicoUno;
	}
	public String getCorreoElectronicoDos() {
		return correoElectronicoDos;
	}
	public void setCorreoElectronicoDos(String correoElectronicoDos) {
		this.correoElectronicoDos = correoElectronicoDos;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
}