package com.bank.credyunion.util.converter;

import java.math.BigDecimal;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;

import com.bank.credyunion.bean.PlanDePagoCreditoBean;
import com.bank.credyunion.domain.T013_PlanDePagoCredito;

public class PlanDePagoCreditoConverterTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void PlanDePagoCreditoConverter_BeanToPojo(){
		BigDecimal capital = new BigDecimal(15.32);
		BigDecimal cargo = new BigDecimal(13.32);
		Date fechaDeCuota = new Date("15/12/2016");
		Date fechaDePago = new Date("20/12/2016");
		String idCredito = "idCredito";
		String idPlanDePagoCredito = "idPlanDePagoCredito";
		String indicadorEliminacion = "indicadorEliminacion";
		BigDecimal interes = new BigDecimal(19.32);
		BigDecimal mora = new BigDecimal(159.32);
		int numeroCuota = 5;
		BigDecimal saldoDeCuota = new BigDecimal(63.32);
		
		PlanDePagoCreditoBean bean = new PlanDePagoCreditoBean();
		bean.setCapital(capital);
		bean.setCargo(cargo);
		bean.setFechaDeCuota(fechaDeCuota);
		bean.setFechaDePago(fechaDePago);
		bean.setIdCredito(idCredito);
		bean.setIdPlanDePagoCredito(idPlanDePagoCredito);
		bean.setIndicadorEliminacion(indicadorEliminacion);
		bean.setInteres(interes);
		bean.setMora(mora);
		bean.setNumeroCuota(numeroCuota);
		bean.setSaldoDeCuota(saldoDeCuota);
		
		T013_PlanDePagoCredito model = PlanDePagoCreditoConverter.parseConverter_FromBeanToPojo(bean);
		
		Assert.assertEquals(capital, model.getCapital());
		Assert.assertEquals(cargo, model.getCargo());
		Assert.assertEquals(fechaDeCuota, model.getFechaDeCuota());
		Assert.assertEquals(fechaDePago, model.getFechaDePago());
		Assert.assertEquals(idCredito, model.getIdCredito());
		Assert.assertEquals(idPlanDePagoCredito, model.getIdPlanDePagoCredito());
		Assert.assertEquals(indicadorEliminacion, model.getIndicadorEliminacion());
		Assert.assertEquals(interes, model.getInteres());
		Assert.assertEquals(mora, model.getMora());
		Assert.assertEquals(numeroCuota, model.getNumeroCuota());
		Assert.assertEquals(saldoDeCuota, model.getSaldoDeCuota());
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void PlanDePagoCreditoConverter_PojoToBean(){
		BigDecimal capital = new BigDecimal(15.32);
		BigDecimal cargo = new BigDecimal(13.32);
		Date fechaDeCuota = new Date("15/12/2016");
		Date fechaDePago = new Date("20/12/2016");
		String idCredito = "idCredito";
		String idPlanDePagoCredito = "idPlanDePagoCredito";
		String indicadorEliminacion = "indicadorEliminacion";
		BigDecimal interes = new BigDecimal(19.32);
		BigDecimal mora = new BigDecimal(159.32);
		int numeroCuota = 5;
		BigDecimal saldoDeCuota = new BigDecimal(63.32);
		
		T013_PlanDePagoCredito model = new T013_PlanDePagoCredito();
		model.setCapital(capital);
		model.setCargo(cargo);
		model.setFechaDeCuota(fechaDeCuota);
		model.setFechaDePago(fechaDePago);
		model.setIdCredito(idCredito);
		model.setIdPlanDePagoCredito(idPlanDePagoCredito);
		model.setIndicadorEliminacion(indicadorEliminacion);
		model.setInteres(interes);
		model.setMora(mora);
		model.setNumeroCuota(numeroCuota);
		model.setSaldoDeCuota(saldoDeCuota);
		
		PlanDePagoCreditoBean bean = PlanDePagoCreditoConverter.parseConverter_FromPojoToBean(model);
		Assert.assertEquals(capital, bean.getCapital());
		Assert.assertEquals(cargo, bean.getCargo());
		Assert.assertEquals(fechaDeCuota, bean.getFechaDeCuota());
		Assert.assertEquals(fechaDePago, bean.getFechaDePago());
		Assert.assertEquals(idCredito, bean.getIdCredito());
		Assert.assertEquals(idPlanDePagoCredito, bean.getIdPlanDePagoCredito());
		Assert.assertEquals(indicadorEliminacion, bean.getIndicadorEliminacion());
		Assert.assertEquals(interes, bean.getInteres());
		Assert.assertEquals(mora, bean.getMora());
		Assert.assertEquals(numeroCuota, bean.getNumeroCuota());
		Assert.assertEquals(saldoDeCuota, bean.getSaldoDeCuota());

	}
	
}
