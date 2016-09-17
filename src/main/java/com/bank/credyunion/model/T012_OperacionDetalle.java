package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class T012_OperacionDetalle implements Serializable {

	private static final long serialVersionUID = 9124820583532228854L; // detalle de la operacion
	private String idOperacionDetalle;
	private String idOperacion;
	private BigDecimal monto;
	private String codigoDeOperacion;
	private String codigoDeSubOperacion;
	private String indicadorEliminacion;
	
	public String getIdOperacionDetalle() {
		return idOperacionDetalle;
	}
	public void setIdOperacionDetalle(String idOperacionDetalle) {
		this.idOperacionDetalle = idOperacionDetalle;
	}
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public String getCodigoDeOperacion() {
		return codigoDeOperacion;
	}
	public void setCodigoDeOperacion(String codigoDeOperacion) {
		this.codigoDeOperacion = codigoDeOperacion;
	}
	public String getCodigoDeSubOperacion() {
		return codigoDeSubOperacion;
	}
	public void setCodigoDeSubOperacion(String codigoDeSubOperacion) {
		this.codigoDeSubOperacion = codigoDeSubOperacion;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}