package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T013_PlanDePagoCredito implements Serializable {

	private static final long serialVersionUID = 8970995986279244728L;// plan de pagos de credito
	private int idPlanDePagoCredito;
	private String idCredito;
	private BigDecimal capital;
	private int numeroCuota;
	private BigDecimal saldoDeCuota;
	private Date fechaDePago;
	private Date fechaDeCuota;
	private BigDecimal interes;
	private BigDecimal cargo;
	private BigDecimal mora; 
	private String indicadorEliminacion;
	
}
