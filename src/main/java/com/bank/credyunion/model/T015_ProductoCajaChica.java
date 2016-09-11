package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigInteger;

public class T015_ProductoCajaChica implements Serializable {
	
	private static final long serialVersionUID = -8278430131956512733L;
	private String idProductoCajaChica;
	private String descripcion;		// description
	private BigInteger monto;		// monto
	private String indicadorEliminacion;
	
}