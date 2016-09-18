package com.bank.credyunion.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CreditoBean {

	private String idCredito;
	private String idSolicitudCredito;
	private String idProductoCredito;
	private String idSocio;
	private BigDecimal montoDeCredito;
	private int cantidadDeCuotas;
	private Date fechaDeAprobacion;
	private Date primeraFechaDePago;
	private Date fechaDeVencimiento;
	private Date fechaDeCancelacion;
	private BigDecimal saldoDeCredito;
	private BigDecimal saldoDeInteres;
	private BigDecimal saldoDeMora;
	private BigDecimal saldoDeDeuda;
	private BigDecimal tasaDeCuota;
	private BigDecimal tasaMoratoria;
	private Date ultimaFechaDePago;
	private String moneda;
	private String codigoAgencia;
	private String codigoUsuario;
	private String estadoCredito;
	private String indicadorEliminacion;
	
	public String getIdCredito() {
		return idCredito;
	}
	public void setIdCredito(String idCredito) {
		this.idCredito = idCredito;
	}
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
	public String getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}
	public BigDecimal getMontoDeCredito() {
		return montoDeCredito;
	}
	public void setMontoDeCredito(BigDecimal montoDeCredito) {
		this.montoDeCredito = montoDeCredito;
	}
	public int getCantidadDeCuotas() {
		return cantidadDeCuotas;
	}
	public void setCantidadDeCuotas(int cantidadDeCuotas) {
		this.cantidadDeCuotas = cantidadDeCuotas;
	}
	public Date getFechaDeAprobacion() {
		return fechaDeAprobacion;
	}
	public void setFechaDeAprobacion(Date fechaDeAprobacion) {
		this.fechaDeAprobacion = fechaDeAprobacion;
	}
	public Date getPrimeraFechaDePago() {
		return primeraFechaDePago;
	}
	public void setPrimeraFechaDePago(Date primeraFechaDePago) {
		this.primeraFechaDePago = primeraFechaDePago;
	}
	public Date getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	public void setFechaDeVencimiento(Date fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	public Date getFechaDeCancelacion() {
		return fechaDeCancelacion;
	}
	public void setFechaDeCancelacion(Date fechaDeCancelacion) {
		this.fechaDeCancelacion = fechaDeCancelacion;
	}
	public BigDecimal getSaldoDeCredito() {
		return saldoDeCredito;
	}
	public void setSaldoDeCredito(BigDecimal saldoDeCredito) {
		this.saldoDeCredito = saldoDeCredito;
	}
	public BigDecimal getSaldoDeInteres() {
		return saldoDeInteres;
	}
	public void setSaldoDeInteres(BigDecimal saldoDeInteres) {
		this.saldoDeInteres = saldoDeInteres;
	}
	public BigDecimal getSaldoDeMora() {
		return saldoDeMora;
	}
	public void setSaldoDeMora(BigDecimal saldoDeMora) {
		this.saldoDeMora = saldoDeMora;
	}
	public BigDecimal getSaldoDeDeuda() {
		return saldoDeDeuda;
	}
	public void setSaldoDeDeuda(BigDecimal saldoDeDeuda) {
		this.saldoDeDeuda = saldoDeDeuda;
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
	public Date getUltimaFechaDePago() {
		return ultimaFechaDePago;
	}
	public void setUltimaFechaDePago(Date ultimaFechaDePago) {
		this.ultimaFechaDePago = ultimaFechaDePago;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
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
	public String getEstadoCredito() {
		return estadoCredito;
	}
	public void setEstadoCredito(String estadoCredito) {
		this.estadoCredito = estadoCredito;
	}
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}
