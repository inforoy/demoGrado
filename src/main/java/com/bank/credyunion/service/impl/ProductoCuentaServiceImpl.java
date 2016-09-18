package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.ProductoCuentaBean;
import com.bank.credyunion.repository.ProductoCuentaRepository;
import com.bank.credyunion.service.ProductoCuentaService;

@Service("productoCuentaService")
public class ProductoCuentaServiceImpl implements ProductoCuentaService {

	@Autowired
	private ProductoCuentaRepository productoCuentaRepository;

	@Override
	public boolean registerProductoCuenta(ProductoCuentaBean productoCuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductoCuenta(ProductoCuentaBean productoCuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductoCuenta(ProductoCuentaBean productoCuentaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductoCuentaBean findProductoCuentaById(
			ProductoCuentaBean productoCuentaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoCuentaBean> findAllProductoCuentas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
