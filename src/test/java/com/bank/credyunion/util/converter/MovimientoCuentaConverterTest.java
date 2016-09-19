package com.bank.credyunion.util.converter;

import org.junit.Test;

import com.bank.credyunion.bean.MovimientoCuentaBean;
import com.bank.credyunion.domain.T010_MovimientoCuenta;

public class MovimientoCuentaConverterTest {
	
	@Test
	public void MovimientoCuentaConverter_BeanToPojo(){
		MovimientoCuentaBean bean = new MovimientoCuentaBean();
//		bean.setCodigoDeOperacion(codigoDeOperacion);
	}
	
	@Test
	public void MovimientoCuentaConverter_PojoToBean(){
		T010_MovimientoCuenta model = new T010_MovimientoCuenta();
	}
	
}
