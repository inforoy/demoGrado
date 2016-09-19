package com.bank.credyunion.bean;

import java.math.BigDecimal;
import java.util.Date;

public class MovimientoCajaChicaBean {

	private String idMovimientoCajaChica;
	private String idCajaChica;
	private String idOperacion;
	private String codigoDeOperacion;
	private BigDecimal montoDeMovimiento;
	private Date fechaDeMovimiento;
	private String movimientoCorrelativo;
	private BigDecimal saldoCapitalActual; 
	private BigDecimal saldoCapitalAnterior;
	private String indicadorEliminacion;
	
	public String getIdMovimientoCajaChica() {
		return idMovimientoCajaChica;
	}
	public void setIdMovimientoCajaChica(String idMovimientoCajaChica) {
		this.idMovimientoCajaChica = idMovimientoCajaChica;
	}
	public String getIdCajaChica() {
		return idCajaChica;
	}
	public void setIdCajaChica(String idCajaChica) {
		this.idCajaChica = idCajaChica;
	}
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	public String getCodigoDeOperacion() {
		return codigoDeOperacion;
	}
	public void setCodigoDeOperacion(String codigoDeOperacion) {
		this.codigoDeOperacion = codigoDeOperacion;
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
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}
