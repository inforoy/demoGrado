package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T004_Credito implements Serializable {

	private static final long serialVersionUID = -245107503746671151L;
	private String idCredito;
	private String idSolicitudCredito;
	private String idProductoCredito;
	private String idSocio;
	private BigDecimal montoDeCredito;
	private int cantidadDeCuotas;
	private Date fechaDeAprobacion;
	private Date primeraFechaDePago;
	private Date fechaDeVencimiento;
	private Date fechaDeCancelacion;
	private BigDecimal saldoDeCredito;
	private BigDecimal saldoDeInteres;
	private BigDecimal saldoDeMora;
	private BigDecimal saldoDeDeuda;
	private BigDecimal tasaDeCuota;
	private BigDecimal tasaMoratoria;
	private Date ultimaFechaDePago;
	private String moneda;
	private String estadoCredito;
	private String codigoAgencia;
	private String codigoUsuario;
	private String indicadorEliminacion;
}
