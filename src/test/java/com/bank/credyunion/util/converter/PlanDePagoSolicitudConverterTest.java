package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.PlanDePagoSolicitudBean;
import com.bank.credyunion.domain.T014_PlanDePagoSolicitud;

public class PlanDePagoSolicitudConverterTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void PlanDePagoSolicitudConverter_BeanToPojo(){
		BigDecimal capital = new BigDecimal(15.32);
		BigDecimal cargo = new BigDecimal(13.32);
		Date fechaDeCuota = new Date("15/12/2016");
		String idPlanDePagoSolicitud = "idPlanDePagoSolicitud";
		String idSolicitudCredito = "idSolicitudCredito";
		String indicadorEliminacion = "indicadorEliminacion";
		BigDecimal interes = new BigDecimal(19.32);
		int numeroCuota = 5;
		BigDecimal saldoDeCuota = new BigDecimal(63.32);
		
		PlanDePagoSolicitudBean bean = new PlanDePagoSolicitudBean();
		bean.setCapital(capital);
		bean.setCargo(cargo);
		bean.setFechaDeCuota(fechaDeCuota);
		bean.setIdPlanDePagoSolicitud(idPlanDePagoSolicitud);
		bean.setIdSolicitudCredito(idSolicitudCredito);
		bean.setIndicadorEliminacion(indicadorEliminacion);
		bean.setInteres(interes);
		bean.setNumeroCuota(numeroCuota);
		bean.setSaldoDeCuota(saldoDeCuota);
		
		T014_PlanDePagoSolicitud model = PlanDePagoSolicitudConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals(capital, model.getCapital());
		Assert.assertEquals(cargo, model.getCargo());
		Assert.assertEquals(fechaDeCuota, model.getFechaDeCuota());
		Assert.assertEquals(idPlanDePagoSolicitud, model.getIdPlanDePagoSolicitud());
		Assert.assertEquals(idSolicitudCredito, model.getIdSolicitudCredito());
		Assert.assertEquals(indicadorEliminacion, model.getIndicadorEliminacion());
		Assert.assertEquals(interes, model.getInteres());
		Assert.assertEquals(numeroCuota, model.getNumeroCuota());
		Assert.assertEquals(saldoDeCuota, model.getSaldoDeCuota());
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void PlanDePagoSolicitudConverter_PojoToBean(){
		BigDecimal capital = new BigDecimal(15.32);
		BigDecimal cargo = new BigDecimal(13.32);
		Date fechaDeCuota = new Date("15/12/2016");
		String idPlanDePagoSolicitud = "idPlanDePagoSolicitud";
		String idSolicitudCredito = "idSolicitudCredito";
		String indicadorEliminacion = "indicadorEliminacion";
		BigDecimal interes = new BigDecimal(19.32);
		int numeroCuota = 5;
		BigDecimal saldoDeCuota = new BigDecimal(63.32);
		
		T014_PlanDePagoSolicitud model = new T014_PlanDePagoSolicitud();
		model.setCapital(capital);
		model.setCargo(cargo);
		model.setFechaDeCuota(fechaDeCuota);
		model.setIdPlanDePagoSolicitud(idPlanDePagoSolicitud);
		model.setIdSolicitudCredito(idSolicitudCredito);
		model.setIndicadorEliminacion(indicadorEliminacion);
		model.setInteres(interes);
		model.setNumeroCuota(numeroCuota);
		model.setSaldoDeCuota(saldoDeCuota);
		
		PlanDePagoSolicitudBean bean = PlanDePagoSolicitudConverter.parseConverter_FromPojoToBean(model); 
		
		Assert.assertEquals(capital, bean.getCapital());
		Assert.assertEquals(cargo, bean.getCargo());
		Assert.assertEquals(fechaDeCuota, bean.getFechaDeCuota());
		Assert.assertEquals(idPlanDePagoSolicitud, bean.getIdPlanDePagoSolicitud());
		Assert.assertEquals(idSolicitudCredito, bean.getIdSolicitudCredito());
		Assert.assertEquals(indicadorEliminacion, bean.getIndicadorEliminacion());
		Assert.assertEquals(interes, bean.getInteres());
		Assert.assertEquals(numeroCuota, bean.getNumeroCuota());
		Assert.assertEquals(saldoDeCuota, bean.getSaldoDeCuota());
		
	}
	
}
