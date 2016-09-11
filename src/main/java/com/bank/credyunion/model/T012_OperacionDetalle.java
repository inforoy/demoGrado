package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class T012_OperacionDetalle implements Serializable {

	private static final long serialVersionUID = 9124820583532228854L; // detalle de la operacion
	private int idOperacionDetalle;
	private String idOperacion;	//numeroTransaccion
	private BigDecimal monto;
	private String codigoDeOperacion;
	private String codigoDeSubOperacion;
	private String indicadorEliminacion;
	
}
