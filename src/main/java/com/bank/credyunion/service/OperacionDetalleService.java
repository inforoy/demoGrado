package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.OperacionDetalleBean;

public interface OperacionDetalleService {

	boolean registerOperacionDetalle(OperacionDetalleBean operacionDetalleBean);
	boolean updateOperacionDetalle(OperacionDetalleBean operacionDetalleBean);
	boolean deleteOperacionDetalle(OperacionDetalleBean operacionDetalleBean);
	OperacionDetalleBean findOperacionDetalleById(OperacionDetalleBean operacionDetalleBean);
	List<OperacionDetalleBean> findAllOperacionDetalles();
	
}
