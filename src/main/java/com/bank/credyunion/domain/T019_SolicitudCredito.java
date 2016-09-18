package com.bank.credyunion.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T019_SolicitudCredito implements Serializable{

	private static final long serialVersionUID = -7074858661024232111L;
	private String idSolicitudCredito;
	private String idProductoCredito;
	private String codigoAgencia;
	private String codigoUsuario;
	private BigDecimal montoSolicitado;
	private int numeroCuotas;
	private Date fechaDeSolicitud;
	private Date primeraFechaPago;
	private Date fechaDeVencimiento;
	private BigDecimal tasaDeCuota;
	private BigDecimal tasaMoratoria;
	private String moneda;
	private String indicadorEliminacion;
	
	public String getIdSolicitudCredito() {
		return idSolicitudCredito;
	}
	public void setIdSolicitudCredito(String idSolicitudCredito) {
		this.idSolicitudCredito = idSolicitudCredito;
	}
	public String getIdProductoCredito() {
		return idProductoCredito;
	}
	public void setIdProductoCredito(String idProductoCredito) {
		this.idProductoCredito = idProductoCredito;
	}
	public String getCodigoAgencia() {
		return codigoAgencia;
	}
	public void setCodigoAgencia(String codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public BigDecimal getMontoSolicitado() {
		return montoSolicitado;
	}
	public void setMontoSolicitado(BigDecimal montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}
	public int getNumeroCuotas() {
		return numeroCuotas;
	}
	public void setNumeroCuotas(int numeroCuotas) {
		this.numeroCuotas = numeroCuotas;
	}
	public Date getFechaDeSolicitud() {
		return fechaDeSolicitud;
	}
	public void setFechaDeSolicitud(Date fechaDeSolicitud) {
		this.fechaDeSolicitud = fechaDeSolicitud;
	}
	public Date getPrimeraFechaPago() {
		return primeraFechaPago;
	}
	public void setPrimeraFechaPago(Date primeraFechaPago) {
		this.primeraFechaPago = primeraFechaPago;
	}
	public Date getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	public void setFechaDeVencimiento(Date fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	public BigDecimal getTasaDeCuota() {
		return tasaDeCuota;
	}
	public void setTasaDeCuota(BigDecimal tasaDeCuota) {
		this.tasaDeCuota = tasaDeCuota;
	}
	public BigDecimal getTasaMoratoria() {
		return tasaMoratoria;
	}
	public void setTasaMoratoria(BigDecimal tasaMoratoria) {
		this.tasaMoratoria = tasaMoratoria;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
}