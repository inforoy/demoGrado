package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class T008_MovCajaChica implements Serializable {

	private static final long serialVersionUID = 7776740262320886113L;	// movimiento de caja chica
	private String idMovCajaChica;
	private String idCajaChica;
	private String idNumeroTransaccion; 
	private BigDecimal saldoCapitalActual; 
	private BigDecimal saldoCapitalAnterior;
	private BigDecimal montoDeMovimiento;
	private BigDecimal fechaDeMovimiento;
	private String codigoDeOperacion;
	private String movimientoCorrelativo;	
	private String indicadorEliminacion;
	
	
}
