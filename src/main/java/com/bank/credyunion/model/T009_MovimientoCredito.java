package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T009_MovimientoCredito implements Serializable {

	private static final long serialVersionUID = 1594050393875102941L;
	private String idMovimientoCredito;
	private String idCredito;
	private String idOperation;
	private BigDecimal capitalActual;
	private BigDecimal capitalAnterior;
	private BigDecimal montoDeMovimiento;
	private Date fechaDeMovimiento;
	private String movimientoCorrelativo;
	private String numeroMovimiento;
	private String codigoDeOperacion;
	private BigDecimal montoDelCapital;
	private BigDecimal montoDelInteres;
	private BigDecimal montoDeMora;
	private BigDecimal montoDelCargo;
	private String codigoUsuario;
	private String codigoAgencia;
	private String indicadorEliminacion;
	
	public String getIdMovimientoCredito() {
		return idMovimientoCredito;
	}
	public void setIdMovimientoCredito(String idMovimientoCredito) {
		this.idMovimientoCredito = idMovimientoCredito;
	}
	public String getIdCredito() {
		return idCredito;
	}
	public void setIdCredito(String idCredito) {
		this.idCredito = idCredito;
	}
	public String getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(String idOperation) {
		this.idOperation = idOperation;
	}
	public BigDecimal getCapitalActual() {
		return capitalActual;
	}
	public void setCapitalActual(BigDecimal capitalActual) {
		this.capitalActual = capitalActual;
	}
	public BigDecimal getCapitalAnterior() {
		return capitalAnterior;
	}
	public void setCapitalAnterior(BigDecimal capitalAnterior) {
		this.capitalAnterior = capitalAnterior;
	}
	public BigDecimal getMontoDeMovimiento() {
		return montoDeMovimiento;
	}
	public void setMontoDeMovimiento(BigDecimal montoDeMovimiento) {
		this.montoDeMovimiento = montoDeMovimiento;
	}
	public Date getFechaDeMovimiento() {
		return fechaDeMovimiento;
	}
	public void setFechaDeMovimiento(Date fechaDeMovimiento) {
		this.fechaDeMovimiento = fechaDeMovimiento;
	}
	public String getMovimientoCorrelativo() {
		return movimientoCorrelativo;
	}
	public void setMovimientoCorrelativo(String movimientoCorrelativo) {
		this.movimientoCorrelativo = movimientoCorrelativo;
	}
	public String getNumeroMovimiento() {
		return numeroMovimiento;
	}
	public void setNumeroMovimiento(String numeroMovimiento) {
		this.numeroMovimiento = numeroMovimiento;
	}
	public String getCodigoDeOperacion() {
		return codigoDeOperacion;
	}
	public void setCodigoDeOperacion(String codigoDeOperacion) {
		this.codigoDeOperacion = codigoDeOperacion;
	}
	public BigDecimal getMontoDelCapital() {
		return montoDelCapital;
	}
	public void setMontoDelCapital(BigDecimal montoDelCapital) {
		this.montoDelCapital = montoDelCapital;
	}
	public BigDecimal getMontoDelInteres() {
		return montoDelInteres;
	}
	public void setMontoDelInteres(BigDecimal montoDelInteres) {
		this.montoDelInteres = montoDelInteres;
	}
	public BigDecimal getMontoDeMora() {
		return montoDeMora;
	}
	public void setMontoDeMora(BigDecimal montoDeMora) {
		this.montoDeMora = montoDeMora;
	}
	public BigDecimal getMontoDelCargo() {
		return montoDelCargo;
	}
	public void setMontoDelCargo(BigDecimal montoDelCargo) {
		this.montoDelCargo = montoDelCargo;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getCodigoAgencia() {
		return codigoAgencia;
	}
	public void setCodigoAgencia(String codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}