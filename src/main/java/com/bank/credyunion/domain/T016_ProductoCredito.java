package com.bank.credyunion.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class T016_ProductoCredito implements Serializable {

	private static final long serialVersionUID = -7460014200270706414L;
	private String idProductoCredito;
	private String descripcion;
	private BigDecimal montoMinimo;
	private BigDecimal montoMaximo;
	private BigDecimal tasa;
	private String indicadorEliminacion;
	
	public String getIdProductoCredito() {
		return idProductoCredito;
	}
	public void setIdProductoCredito(String idProductoCredito) {
		this.idProductoCredito = idProductoCredito;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getMontoMinimo() {
		return montoMinimo;
	}
	public void setMontoMinimo(BigDecimal montoMinimo) {
		this.montoMinimo = montoMinimo;
	}
	public BigDecimal getMontoMaximo() {
		return montoMaximo;
	}
	public void setMontoMaximo(BigDecimal montoMaximo) {
		this.montoMaximo = montoMaximo;
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