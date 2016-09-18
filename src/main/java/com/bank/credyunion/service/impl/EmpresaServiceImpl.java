package com.bank.credyunion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.EmpresaBean;
import com.bank.credyunion.bean.UsuarioBean;
import com.bank.credyunion.domain.T006_Empresa;
import com.bank.credyunion.repository.BusinessRepository;
import com.bank.credyunion.service.EmpresaService;
import com.bank.credyunion.util.converter.BusinessConverter;

@Service("businessService")
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
    private BusinessRepository businessRepository;

	@Override
	public boolean registerBusiness(EmpresaBean empresa) {
		int next = businessRepository.getNextBusiness();
		empresa.setIdEmpresa(String.valueOf(next));
		empresa.setIndicadorEliminacion("0");
		
		T006_Empresa tEmpresa = new T006_Empresa();
		tEmpresa = BusinessConverter.parseConverter_FromBeanToPojo(empresa);
		boolean isRegister = businessRepository.registerBusiness(tEmpresa);
		return isRegister;
	}

	@Override
	public boolean updateBusiness(EmpresaBean empresa) {
		T006_Empresa tEmpresa = BusinessConverter.parseConverter_FromBeanToPojo(empresa);
		boolean isUpdate = businessRepository.updateBusiness(tEmpresa);
		return isUpdate;
	}

	@Override
	public boolean deleteBusiness(EmpresaBean empresa) {
		empresa.setIndicadorEliminacion("0");
		T006_Empresa tEmpresa = BusinessConverter.parseConverter_FromBeanToPojo(empresa);
		boolean result = businessRepository.deleteBusiness(tEmpresa);
		return result;
	}

	@Override
	public EmpresaBean findBusinessById(EmpresaBean empresa) {
		T006_Empresa tEmpresa = BusinessConverter.parseConverter_FromBeanToPojo(empresa);
		tEmpresa = businessRepository.findBusinessById(tEmpresa);
		EmpresaBean newEmpresa = BusinessConverter.parseConverter_FromPojoToBean(tEmpresa);
		return newEmpresa;
	}

	@Override
	public List<EmpresaBean> findAllBusiness() {
		List<T006_Empresa> listBusiness = businessRepository.findAllBusiness();
		List<EmpresaBean> listadoEmpresas = new ArrayList<EmpresaBean>();
		for (T006_Empresa item : listBusiness ) {
			EmpresaBean empresa = BusinessConverter.parseConverter_FromPojoToBean(item);
			listadoEmpresas.add(empresa);
		}
		return listadoEmpresas;
	}

}
