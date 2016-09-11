package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T003_CajaChica implements Serializable {

	private static final long serialVersionUID = 399566585502560880L;
	private String idCajaChica;
	private String idProductoCajaChica;
	private String idSocio;
	private BigDecimal ingresoTotal;
	private BigDecimal engresoTotal;		
	private BigDecimal saldoDeCierre;
	private Date fechaDeProceso;
	private String documentoDeReferencia;
	private String indicadorEliminacion;
	
}
