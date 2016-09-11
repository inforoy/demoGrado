package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T002_Caja implements Serializable {
	
	private static final long serialVersionUID = 3861539378193840194L;
	private int idCaja;
	private String idAgencia;
	private String nombreDeUsuario;
	private Date fechaDeProceso;
	private BigDecimal saldoInicial;
	private BigDecimal saldoFinal;
	private BigDecimal ingresoTotal;
	private BigDecimal egresoTotal;
	private BigDecimal montoDeCierre;		
	private String documentoDeReferencia;	
	private String indicadorEliminacion;
	
}
