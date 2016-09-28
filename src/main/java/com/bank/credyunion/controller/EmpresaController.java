package com.bank.credyunion.controller;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.credyunion.bean.EmpresaBean;
import com.bank.credyunion.service.EmpresaService;

@Controller
public class EmpresaController {

	@Autowired
	EmpresaService businessService;
	
	@RequestMapping(value="/empresaTest.htm", method = RequestMethod.GET)
	public String loadEmpresa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmpresaBean empresa = new EmpresaBean();
		empresa.setDescripcion("CredyUnion");
		empresa.setFechaDeCreacion(new Date());
		try {
//			boolean istrue = businessService.registerBusiness(empresa);
//			
//			empresa.setDescripcion("nueva descripcion");
//			empresa.setFechaDeCreacion(new Date());
//			boolean istrue2 = businessService.updateBusiness(empresa);
//			
//			empresa.setIdEmpresa("1");
//			EmpresaBean empre2 = businessService.findBusinessById(empresa);
//			
//			List<EmpresaBean> list = businessService.findAllBusiness();
//			
//			boolean istrue3 = businessService.deleteBusiness(empresa);
		} catch (Exception e) {
			System.out.println("Error"+e);
		}
		return "home";
	}
	
}
