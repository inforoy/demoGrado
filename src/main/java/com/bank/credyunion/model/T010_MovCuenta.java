package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T010_MovCuenta implements Serializable {
	private static final long serialVersionUID = 9110716532077198702L;
	private int idMovCuenta;	// movimiento de cuenta
	private String idCuenta;
	private String idOperation;
	private String idUsuario;
	private BigDecimal saldoCapitalActual;
	private BigDecimal saldoCapitalAnterior;
	private BigDecimal montoMovimiento;
	private Date fechaMovimiento;
	private String movimientoCorrelativo;
	private String codigoDeOperacion;
	private String indicadorEliminacion;
	
}
