package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T010_MovimientoCuenta implements Serializable {
	private static final long serialVersionUID = 9110716532077198702L;
	private String idMovimientoCuenta;
	private String idCuenta;
	private String idOperation;
	private BigDecimal saldoCapitalActual;
	private BigDecimal saldoCapitalAnterior;
	private BigDecimal montoMovimiento;
	private Date fechaMovimiento;
	private String movimientoCorrelativo;
	private String codigoDeOperacion;
	private String codigoUsuario;
	private String indicadorEliminacion;
	
	public String getIdMovimientoCuenta() {
		return idMovimientoCuenta;
	}
	public void setIdMovimientoCuenta(String idMovimientoCuenta) {
		this.idMovimientoCuenta = idMovimientoCuenta;
	}
	public String getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(String idOperation) {
		this.idOperation = idOperation;
	}
	public BigDecimal getSaldoCapitalActual() {
		return saldoCapitalActual;
	}
	public void setSaldoCapitalActual(BigDecimal saldoCapitalActual) {
		this.saldoCapitalActual = saldoCapitalActual;
	}
	public BigDecimal getSaldoCapitalAnterior() {
		return saldoCapitalAnterior;
	}
	public void setSaldoCapitalAnterior(BigDecimal saldoCapitalAnterior) {
		this.saldoCapitalAnterior = saldoCapitalAnterior;
	}
	public BigDecimal getMontoMovimiento() {
		return montoMovimiento;
	}
	public void setMontoMovimiento(BigDecimal montoMovimiento) {
		this.montoMovimiento = montoMovimiento;
	}
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public String getMovimientoCorrelativo() {
		return movimientoCorrelativo;
	}
	public void setMovimientoCorrelativo(String movimientoCorrelativo) {
		this.movimientoCorrelativo = movimientoCorrelativo;
	}
	public String getCodigoDeOperacion() {
		return codigoDeOperacion;
	}
	public void setCodigoDeOperacion(String codigoDeOperacion) {
		this.codigoDeOperacion = codigoDeOperacion;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}