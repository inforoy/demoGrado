package com.bank.credyunion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class T011_Operacion implements Serializable {

	private static final long serialVersionUID = 2314209064831206875L;
	private String idOperacion;
	private String numeroTransaccion;
	private BigDecimal montoMovimiento;
	private String codigoDeOperacion;
	private String documentoDeReferencia;
	private String indicadorMovimiento;
	private Date fechaDeOperacion;
	private String operacionCorrelativa;
	private String moneda;
	private String observacion;
	private String codigoSocio;	
	private String nombreSocio;
	private String codigoAgencia;
	private String codigoUsuario;
	private String indicadorEliminacion;
	
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	public String getNumeroTransaccion() {
		return numeroTransaccion;
	}
	public void setNumeroTransaccion(String numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}
	public BigDecimal getMontoMovimiento() {
		return montoMovimiento;
	}
	public void setMontoMovimiento(BigDecimal montoMovimiento) {
		this.montoMovimiento = montoMovimiento;
	}
	public String getCodigoDeOperacion() {
		return codigoDeOperacion;
	}
	public void setCodigoDeOperacion(String codigoDeOperacion) {
		this.codigoDeOperacion = codigoDeOperacion;
	}
	public String getDocumentoDeReferencia() {
		return documentoDeReferencia;
	}
	public void setDocumentoDeReferencia(String documentoDeReferencia) {
		this.documentoDeReferencia = documentoDeReferencia;
	}
	public String getIndicadorMovimiento() {
		return indicadorMovimiento;
	}
	public void setIndicadorMovimiento(String indicadorMovimiento) {
		this.indicadorMovimiento = indicadorMovimiento;
	}
	public Date getFechaDeOperacion() {
		return fechaDeOperacion;
	}
	public void setFechaDeOperacion(Date fechaDeOperacion) {
		this.fechaDeOperacion = fechaDeOperacion;
	}
	public String getOperacionCorrelativa() {
		return operacionCorrelativa;
	}
	public void setOperacionCorrelativa(String operacionCorrelativa) {
		this.operacionCorrelativa = operacionCorrelativa;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getCodigoSocio() {
		return codigoSocio;
	}
	public void setCodigoSocio(String codigoSocio) {
		this.codigoSocio = codigoSocio;
	}
	public String getNombreSocio() {
		return nombreSocio;
	}
	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
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
	public String getIndicadorEliminacion() {
		return indicadorEliminacion;
	}
	public void setIndicadorEliminacion(String indicadorEliminacion) {
		this.indicadorEliminacion = indicadorEliminacion;
	}
	
	
}