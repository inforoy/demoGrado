package com.bank.credyunion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.ProductoCreditoBean;
import com.bank.credyunion.repository.ProductoCreditoRepository;
import com.bank.credyunion.service.ProductoCreditoService;

@Service("productoCreditoService")
public class ProductoCreditoServiceImpl implements ProductoCreditoService {

	@Autowired
	private ProductoCreditoRepository productoCreditoRepository;

	@Override
	public boolean registerProductoCredito(
			ProductoCreditoBean productoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProductoCredito(ProductoCreditoBean productoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductoCredito(ProductoCreditoBean productoCreditoBean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductoCreditoBean findProductoCreditoById(
			ProductoCreditoBean productoCreditoBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoCreditoBean> findAllProductoCreditos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
