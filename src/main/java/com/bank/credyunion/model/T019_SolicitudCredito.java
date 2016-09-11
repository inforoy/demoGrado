package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T019_SolicitudCredito implements Serializable{

	private static final long serialVersionUID = -7074858661024232111L;
	private String idSolicitudCredito;
	private String idProductoCredito;
	private String codigoAgencia;
	private String codigoUsuario;
	private BigDecimal montoSolicitado;
	private int numeroCuotas;
	private Date fechaDeSolicitud;
	private Date primeraFechaPago;
	private Date fechaDeVencimiento;
	private BigDecimal tasaDeCuota;
	private BigDecimal tasaMoratoria;
	private String moneda;
	private String indicadorEliminacion;
	
}
