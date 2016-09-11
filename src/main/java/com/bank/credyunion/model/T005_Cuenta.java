package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T005_Cuenta implements Serializable {
	
	private static final long serialVersionUID = 440319246465247042L;
	private String idCuenta;
	private String idSocio;
	private String idProductoCuenta;
	private BigDecimal saldoCapital;
	private BigDecimal montoDeApertura;
	private Date fechaDeApertura;
	private Date fechaDeCancelacion;
	private String moneda;
	private String movimientoCorrelativo;
	private String usuarioApertura;
	private String usuarioCancelacion;
	private String observacion;
	private String codigoAgencia;
	private String estadoCuenta;
	private String indicadorEliminacion;
	
	
}
