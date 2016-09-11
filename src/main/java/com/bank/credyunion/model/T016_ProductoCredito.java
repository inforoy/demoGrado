package com.bank.credyunion.model;

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
	
}
