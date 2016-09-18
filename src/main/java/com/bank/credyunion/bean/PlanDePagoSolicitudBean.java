package com.bank.credyunion.bean;

import java.math.BigDecimal;
import java.util.Date;

public class PlanDePagoSolicitudBean {

	private String idPlanDePagoSolicitud;
	private String idSolicitudCredito;
	private BigDecimal capital;
	private int numeroCuota;
	private Date fechaDeCuota;
	private BigDecimal saldoDeCuota;
	private BigDecimal interes;
	private BigDecimal cargo;
	private String indicadorEliminacion;
	
	public String getIdPlanDePagoSolicitud() {
		return idPlanDePagoSolicitud;
	}
	public void setIdPlanDePagoSolicitud(String idPlanDePagoSolicitud) {
		this.idPlanDePagoSolicitud = idPlanDePagoSolicitud;
	}
	public String getIdSolicitudCredito() {
		return idSolicitudCredito;
	}
	public void setIdSolicitudCredito(String idSolicitudCredito) {
		this.idSolicitudCredito = idSolicitudCredito;
	}
	public BigDecimal getCapital() {
		return capital;
	}
	public void setCapital(BigDecimal capital) {
		this.capital = capital;
	}
	public int getNumeroCuota() {
		return numeroCuota;
	}
	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	public Date getFechaDeCuota() {
		return fechaDeCuota;
	}
	public void setFechaDeCuota(Date fechaDeCuota) {
		this.fechaDeCuota = fechaDeCuota;
	}
	public BigDecimal getSaldoDeCuota() {
		return saldoDeCuota;
	}
	public void setSaldoDeCuota(BigDecimal saldoDeCuota) {
		this.saldoDeCuota = saldoDeCuota;
	}
	public BigDecimal getInteres() {
		return interes;
	}
	public void setInteres(BigDecimal interes) {
		this.interes = interes;
	}
	public BigDecimal getCargo() {
		return cargo;
	}
	public void setCargo(BigDecimal cargo) {
		this.cargo = cargo;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}
