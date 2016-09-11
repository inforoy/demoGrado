package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T011_Operacion implements Serializable {

	private static final long serialVersionUID = 2314209064831206875L;	// operacion
	private String idOperacion;
	private String numeroTransaccion;
	private BigDecimal montoMovimiento;	
	private String indicadorMovimiento;
	private Date fechaDeOperacion;
	private String operacionCorrelativa;
	private String codigoDeOperacion;	
	private String documentoDeReferencia;
	private String moneda;
	private String codigoSocio;	
	private String nombreSocio;
	private String codigoAgencia;
	private String codigoUsuario;
	private String observacion;
	private String indicadorEliminacion;
	
}
