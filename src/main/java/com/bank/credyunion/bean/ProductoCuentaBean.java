package com.bank.credyunion.bean;

import java.math.BigDecimal;

public class ProductoCuentaBean {

	private String idProductoCuenta;
	private String descripcion;
	private BigDecimal montoMaximo;
	private BigDecimal montoMinimo;
	private BigDecimal tasa;
	private String indicadorEliminacion;
	
	public String getIdProductoCuenta() {
		return idProductoCuenta;
	}
	public void setIdProductoCuenta(String idProductoCuenta) {
		this.idProductoCuenta = idProductoCuenta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getMontoMaximo() {
		return montoMaximo;
	}
	public void setMontoMaximo(BigDecimal montoMaximo) {
		this.montoMaximo = montoMaximo;
	}
	public BigDecimal getMontoMinimo() {
		return montoMinimo;
	}
	public void setMontoMinimo(BigDecimal montoMinimo) {
		this.montoMinimo = montoMinimo;
	}
	public BigDecimal getTasa() {
		return tasa;
	}
	public void setTasa(BigDecimal tasa) {
		this.tasa = tasa;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}
