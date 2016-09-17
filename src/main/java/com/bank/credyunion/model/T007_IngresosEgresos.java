package com.bank.credyunion.model;

import java.io.Serializable;

public class T007_IngresosEgresos implements Serializable {

	private static final long serialVersionUID = -4059485147449018356L;
	private String idIngresoEgreso;
	private String descripcion;
	private String indicadorDeMovimiento;
	private String codigoOperacion;
	private String indicadorEliminacion;
	
	public String getIdIngresoEgreso() {
		return idIngresoEgreso;
	}
	public void setIdIngresoEgreso(String idIngresoEgreso) {
		this.idIngresoEgreso = idIngresoEgreso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getIndicadorDeMovimiento() {
		return indicadorDeMovimiento;
	}
	public void setIndicadorDeMovimiento(String indicadorDeMovimiento) {
		this.indicadorDeMovimiento = indicadorDeMovimiento;
	}
	public String getCodigoOperacion() {
		return codigoOperacion;
	}
	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}