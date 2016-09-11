package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class T017_ProductoCuenta implements Serializable {
	
	private static final long serialVersionUID = 738664173588342387L;
	private String idProductoCuenta;
	private String descripcion;
	private BigDecimal montoMaximo;
	private BigDecimal montoMinimo;
	private BigDecimal tasa;
	private String indicadorEliminacion;
	
}