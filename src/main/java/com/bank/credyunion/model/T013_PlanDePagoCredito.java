package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T013_PlanDePagoCredito implements Serializable {

	private static final long serialVersionUID = 8970995986279244728L;// plan de pagos de credito
	private String idPlanDePagoCredito;
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
	
	public String getIdPlanDePagoCredito() {
		return idPlanDePagoCredito;
	}
	public void setIdPlanDePagoCredito(String idPlanDePagoCredito) {
		this.idPlanDePagoCredito = idPlanDePagoCredito;
	}
	public String getIdCredito() {
		return idCredito;
	}
	public void setIdCredito(String idCredito) {
		this.idCredito = idCredito;
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
	public BigDecimal getSaldoDeCuota() {
		return saldoDeCuota;
	}
	public void setSaldoDeCuota(BigDecimal saldoDeCuota) {
		this.saldoDeCuota = saldoDeCuota;
	}
	public Date getFechaDePago() {
		return fechaDePago;
	}
	public void setFechaDePago(Date fechaDePago) {
		this.fechaDePago = fechaDePago;
	}
	public Date getFechaDeCuota() {
		return fechaDeCuota;
	}
	public void setFechaDeCuota(Date fechaDeCuota) {
		this.fechaDeCuota = fechaDeCuota;
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
	public BigDecimal getMora() {
		return mora;
	}
	public void setMora(BigDecimal mora) {
		this.mora = mora;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}