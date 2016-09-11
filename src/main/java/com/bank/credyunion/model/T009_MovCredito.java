package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T009_MovCredito implements Serializable {	// movimientos de credito

	private static final long serialVersionUID = 1594050393875102941L;
	private String idMovCredito;
	private String idCredito;
	private String idOperation;// numeroDeTransaccion
	private BigDecimal capitalActual;
	private BigDecimal capitalAnterior;
	private BigDecimal montoDeMovimiento;
	private Date fechaDeMovimiento;
	private String movimientoCorrelativo;
	private String numeroMovimiento;
	private String codigoDeOperacion;
	private BigDecimal montoDelCapital;
	private BigDecimal montoDelInteres;
	private BigDecimal montoDeMora;
	private BigDecimal montoDelCargo;
	private String codigoUsuario;
	private String codigoAgencia;
	private String indicadorEliminacion;
	
}