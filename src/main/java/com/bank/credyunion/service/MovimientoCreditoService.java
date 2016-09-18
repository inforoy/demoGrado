package com.bank.credyunion.service;

import java.util.List;

import com.bank.credyunion.bean.MovimientoCreditoBean;

public interface MovimientoCreditoService {
	
	boolean registerMovimientoCredito(MovimientoCreditoBean movimientoCreditoBean);
	boolean updateMovimientoCredito(MovimientoCreditoBean movimientoCreditoBean);
	boolean deleteMovimientoCredito(MovimientoCreditoBean movimientoCreditoBean);
	MovimientoCreditoBean findMovimientoCreditoById(MovimientoCreditoBean movimientoCreditoBean);
	List<MovimientoCreditoBean> findAllMovimientoCreditos();

}
