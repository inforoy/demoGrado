package com.bank.credyunion.util.converter;

import org.junit.Test;

import com.bank.credyunion.bean.MovimientoCreditoBean;
import com.bank.credyunion.domain.T009_MovimientoCredito;

public class MovimientoCreditoConverterTest {
	
	@Test
	public void MovimientoCreditoConverter_BeanToPojo(){
		MovimientoCreditoBean bean = new MovimientoCreditoBean();
//		bean.setCapitalActual(capitalActual);
	}
	
	@Test
	public void MovimientoCreditoConverter_PojoToBean(){
		T009_MovimientoCredito model = new T009_MovimientoCredito();
	}
	
}
