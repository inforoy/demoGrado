package com.bank.credyunion.util.converter;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.SocioBean;
import com.bank.credyunion.domain.T018_Socio;

public class SocioConverterTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void SocioConverter_BeanToPojo(){
		String apellidoMaterno = "apellidoMaterno";
		String apellidoPaterno = "apellidoPaterno";
		String correoElectronicoDos = "correoElectronicoDos";
		String correoElectronicoUno = "correoElectronicoUno";
		String idAgencia = "idAgencia";
		String idSocio = "idSocio";
		Date fechaDeIngreso = new Date("12/12/2016");
		Date fechaDeNacimiento = new Date("10/12/2016");
		String indicadorEliminacion = "indicadorEliminacion";
		String nombres = "nombres";
		String numeroDni = "numeroDni";
		String telefonoFijo = "telefonoFijo";
		String telefonoMovilDos = "telefonoMovilDos";
		String telefonoMovilUno = "telefonoMovilUno";
		
		SocioBean bean = new SocioBean();
		bean.setApellidoMaterno(apellidoMaterno);
		bean.setApellidoPaterno(apellidoPaterno);
		bean.setCorreoElectronicoDos(correoElectronicoDos);
		bean.setCorreoElectronicoUno(correoElectronicoUno);
		bean.setFechaDeIngreso(fechaDeIngreso);
		bean.setFechaDeNacimiento(fechaDeNacimiento);
		bean.setIdAgencia(idAgencia);
		bean.setIdSocio(idSocio);
		bean.setIndicadorEliminacion(indicadorEliminacion);
		bean.setNombres(nombres);
		bean.setNumeroDni(numeroDni);
		bean.setTelefonoFijo(telefonoFijo);
		bean.setTelefonoMovilDos(telefonoMovilDos);
		bean.setTelefonoMovilUno(telefonoMovilUno);
		
		T018_Socio model = SocioConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals(apellidoMaterno, model.getApellidoMaterno());
		Assert.assertEquals(apellidoPaterno, model.getApellidoPaterno());
		Assert.assertEquals(correoElectronicoDos, model.getCorreoElectronicoDos());
		Assert.assertEquals(correoElectronicoUno, model.getCorreoElectronicoUno());
		Assert.assertEquals(fechaDeIngreso, model.getFechaDeIngreso());
		Assert.assertEquals(fechaDeNacimiento, model.getFechaDeNacimiento());
		Assert.assertEquals(idAgencia, model.getIdAgencia());
		Assert.assertEquals(idSocio, model.getIdSocio());
		Assert.assertEquals(indicadorEliminacion, model.getIndicadorEliminacion());
		Assert.assertEquals(nombres, model.getNombres());
		Assert.assertEquals(numeroDni, model.getNumeroDni());
		Assert.assertEquals(telefonoFijo, model.getTelefonoFijo());
		Assert.assertEquals(telefonoMovilDos, model.getTelefonoMovilDos());
		Assert.assertEquals(telefonoMovilUno, model.getTelefonoMovilUno());
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void SocioConverter_PojoToBean(){
		String apellidoMaterno = "apellidoMaterno";
		String apellidoPaterno = "apellidoPaterno";
		String correoElectronicoDos = "correoElectronicoDos";
		String correoElectronicoUno = "correoElectronicoUno";
		String idAgencia = "idAgencia";
		String idSocio = "idSocio";
		Date fechaDeIngreso = new Date("12/12/2016");
		Date fechaDeNacimiento = new Date("10/12/2016");
		String indicadorEliminacion = "indicadorEliminacion";
		String nombres = "nombres";
		String numeroDni = "numeroDni";
		String telefonoFijo = "telefonoFijo";
		String telefonoMovilDos = "telefonoMovilDos";
		String telefonoMovilUno = "telefonoMovilUno";
		
		T018_Socio model = new T018_Socio();
		model.setApellidoMaterno(apellidoMaterno);
		model.setApellidoPaterno(apellidoPaterno);
		model.setCorreoElectronicoDos(correoElectronicoDos);
		model.setCorreoElectronicoUno(correoElectronicoUno);
		model.setFechaDeIngreso(fechaDeIngreso);
		model.setFechaDeNacimiento(fechaDeNacimiento);
		model.setIdAgencia(idAgencia);
		model.setIdSocio(idSocio);
		model.setIndicadorEliminacion(indicadorEliminacion);
		model.setNombres(nombres);
		model.setNumeroDni(numeroDni);
		model.setTelefonoFijo(telefonoFijo);
		model.setTelefonoMovilDos(telefonoMovilDos);
		model.setTelefonoMovilUno(telefonoMovilUno);
		
		SocioBean bean = SocioConverter.parseConverter_FromPojoToBean(model);
		
		Assert.assertEquals(apellidoMaterno, bean.getApellidoMaterno());
		Assert.assertEquals(apellidoPaterno, bean.getApellidoPaterno());
		Assert.assertEquals(correoElectronicoDos, bean.getCorreoElectronicoDos());
		Assert.assertEquals(correoElectronicoUno, bean.getCorreoElectronicoUno());
		Assert.assertEquals(fechaDeIngreso, bean.getFechaDeIngreso());
		Assert.assertEquals(fechaDeNacimiento, bean.getFechaDeNacimiento());
		Assert.assertEquals(idAgencia, bean.getIdAgencia());
		Assert.assertEquals(idSocio, bean.getIdSocio());
		Assert.assertEquals(indicadorEliminacion, bean.getIndicadorEliminacion());
		Assert.assertEquals(nombres, bean.getNombres());
		Assert.assertEquals(numeroDni, bean.getNumeroDni());
		Assert.assertEquals(telefonoFijo, bean.getTelefonoFijo());
		Assert.assertEquals(telefonoMovilDos, bean.getTelefonoMovilDos());
		Assert.assertEquals(telefonoMovilUno, bean.getTelefonoMovilUno());
		
	}
	
}
