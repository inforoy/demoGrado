package com.bank.credyunion.bean;

import java.math.BigDecimal;

public class ProductoCajaChicaBean {

	private String idProductoCajaChica;
	private String descripcion;
	private BigDecimal monto;
	private String indicadorEliminacion;
	
	public String getIdProductoCajaChica() {
		return idProductoCajaChica;
	}
	public void setIdProductoCajaChica(String idProductoCajaChica) {
		this.idProductoCajaChica = idProductoCajaChica;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}
