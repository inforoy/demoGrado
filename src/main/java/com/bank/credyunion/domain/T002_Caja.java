package com.bank.credyunion.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T002_Caja implements Serializable {
	
	private static final long serialVersionUID = 3861539378193840194L;
	private String idCaja;
	private String idAgencia;
	private String documentoDeReferencia;
	private BigDecimal montoDeCierre;
	private Date fechaDeProceso;
	private BigDecimal saldoInicial;
	private BigDecimal saldoFinal;
	private BigDecimal ingresoTotal;
	private BigDecimal egresoTotal;
	private String codigoDeUsuario;
	private String nombreDeUsuario;
	private String indicadorEliminacion;
	
	public String getIdCaja() {
		return idCaja;
	}
	public void setIdCaja(String idCaja) {
		this.idCaja = idCaja;
	}
	public String getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getDocumentoDeReferencia() {
		return documentoDeReferencia;
	}
	public void setDocumentoDeReferencia(String documentoDeReferencia) {
		this.documentoDeReferencia = documentoDeReferencia;
	}
	public BigDecimal getMontoDeCierre() {
		return montoDeCierre;
	}
	public void setMontoDeCierre(BigDecimal montoDeCierre) {
		this.montoDeCierre = montoDeCierre;
	}
	public Date getFechaDeProceso() {
		return fechaDeProceso;
	}
	public void setFechaDeProceso(Date fechaDeProceso) {
		this.fechaDeProceso = fechaDeProceso;
	}
	public BigDecimal getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(BigDecimal saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public BigDecimal getSaldoFinal() {
		return saldoFinal;
	}
	public void setSaldoFinal(BigDecimal saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	public BigDecimal getIngresoTotal() {
		return ingresoTotal;
	}
	public void setIngresoTotal(BigDecimal ingresoTotal) {
		this.ingresoTotal = ingresoTotal;
	}
	public BigDecimal getEgresoTotal() {
		return egresoTotal;
	}
	public void setEgresoTotal(BigDecimal egresoTotal) {
		this.egresoTotal = egresoTotal;
	}
	public String getCodigoDeUsuario() {
		return codigoDeUsuario;
	}
	public void setCodigoDeUsuario(String codigoDeUsuario) {
		this.codigoDeUsuario = codigoDeUsuario;
	}
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}