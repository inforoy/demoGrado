package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.ProductoCajaChicaBean;
import com.bank.credyunion.repository.ProductoCajaChicaRepository;
import com.bank.credyunion.service.ProductoCajaChicaService;

@Service("productoCajaChicaService")
public class ProductoCajaChicaServiceImpl implements ProductoCajaChicaService {

	@Autowired
	private ProductoCajaChicaRepository productoCajaChicaRepository;

	@Override
	public boolean registerProductoCajaChica(
			ProductoCajaChicaBean productoCajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductoCajaChica(
			ProductoCajaChicaBean productoCajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductoCajaChica(
			ProductoCajaChicaBean productoCajaChicaBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductoCajaChicaBean findProductoCajaChicaById(
			ProductoCajaChicaBean productoCajaChicaBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoCajaChicaBean> findAllProductoCajaChicas() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
