package com.bank.credyunion.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T005_Cuenta implements Serializable {
	
	private static final long serialVersionUID = 440319246465247042L;
	private String idCuenta;
	private String idProductoCuenta;
	private String idSocio;
	private BigDecimal saldoCapital;
	private BigDecimal montoDeApertura;
	private Date fechaDeApertura;
	private Date fechaDeCancelacion;
	private String moneda;
	private String movimientoCorrelativo;
	private String codigoUsuarioApertura;
	private String codigoUsuarioCancelacion;
	private String observacion;
	private String codigoAgencia;
	private String estadoCuenta;
	private String indicadorEliminacion;
	
	public String getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getIdProductoCuenta() {
		return idProductoCuenta;
	}
	public void setIdProductoCuenta(String idProductoCuenta) {
		this.idProductoCuenta = idProductoCuenta;
	}
	public String getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}
	public BigDecimal getSaldoCapital() {
		return saldoCapital;
	}
	public void setSaldoCapital(BigDecimal saldoCapital) {
		this.saldoCapital = saldoCapital;
	}
	public BigDecimal getMontoDeApertura() {
		return montoDeApertura;
	}
	public void setMontoDeApertura(BigDecimal montoDeApertura) {
		this.montoDeApertura = montoDeApertura;
	}
	public Date getFechaDeApertura() {
		return fechaDeApertura;
	}
	public void setFechaDeApertura(Date fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	public Date getFechaDeCancelacion() {
		return fechaDeCancelacion;
	}
	public void setFechaDeCancelacion(Date fechaDeCancelacion) {
		this.fechaDeCancelacion = fechaDeCancelacion;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getMovimientoCorrelativo() {
		return movimientoCorrelativo;
	}
	public void setMovimientoCorrelativo(String movimientoCorrelativo) {
		this.movimientoCorrelativo = movimientoCorrelativo;
	}
	public String getCodigoUsuarioApertura() {
		return codigoUsuarioApertura;
	}
	public void setCodigoUsuarioApertura(String codigoUsuarioApertura) {
		this.codigoUsuarioApertura = codigoUsuarioApertura;
	}
	public String getCodigoUsuarioCancelacion() {
		return codigoUsuarioCancelacion;
	}
	public void setCodigoUsuarioCancelacion(String codigoUsuarioCancelacion) {
		this.codigoUsuarioCancelacion = codigoUsuarioCancelacion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getCodigoAgencia() {
		return codigoAgencia;
	}
	public void setCodigoAgencia(String codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}
	public String getEstadoCuenta() {
		return estadoCuenta;
	}
	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}