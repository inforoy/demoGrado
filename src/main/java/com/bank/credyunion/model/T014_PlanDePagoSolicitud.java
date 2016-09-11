package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T014_PlanDePagoSolicitud implements Serializable {

	private static final long serialVersionUID = -4608669733093837188L;
	private int idPlanDePagoSolicitud;
	private String idSolicitudCredito;
	private BigDecimal capital;
	private BigDecimal numeroCuota;
	private Date fechaDeCuota;
	private BigDecimal saldoDeCuota;
	private BigDecimal interes;
	private BigDecimal cargo;
	private String indicadorEliminacion;
	
}
