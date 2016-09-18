package com.bank.credyunion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.credyunion.bean.EmpresaBean;
import com.bank.credyunion.domain.T006_Empresa;
import com.bank.credyunion.repository.EmpresaRepository;
import com.bank.credyunion.service.EmpresaService;
import com.bank.credyunion.util.converter.EmpresaConverter;

@Service("businessService")
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
    private EmpresaRepository empresaRepository;

	@Override
	public boolean registerEmpresa(EmpresaBean empresa) {
		int next = empresaRepository.getNextBusiness();
		empresa.setIdEmpresa(String.valueOf(next));
		empresa.setIndicadorEliminacion("0");
		
		T006_Empresa tEmpresa = new T006_Empresa();
		tEmpresa = EmpresaConverter.parseConverter_FromBeanToPojo(empresa);
		boolean isRegister = empresaRepository.registerBusiness(tEmpresa);
		return isRegister;
	}

	@Override
	public boolean updateEmpresa(EmpresaBean empresa) {
		T006_Empresa tEmpresa = EmpresaConverter.parseConverter_FromBeanToPojo(empresa);
		boolean isUpdate = empresaRepository.updateBusiness(tEmpresa);
		return isUpdate;
	}

	@Override
	public boolean deleteEmpresa(EmpresaBean empresa) {
		empresa.setIndicadorEliminacion("0");
		T006_Empresa tEmpresa = EmpresaConverter.parseConverter_FromBeanToPojo(empresa);
		boolean result = empresaRepository.deleteBusiness(tEmpresa);
		return result;
	}

	@Override
	public EmpresaBean findEmpresaById(EmpresaBean empresa) {
		T006_Empresa tEmpresa = EmpresaConverter.parseConverter_FromBeanToPojo(empresa);
		tEmpresa = empresaRepository.findBusinessById(tEmpresa);
		EmpresaBean newEmpresa = EmpresaConverter.parseConverter_FromPojoToBean(tEmpresa);
		return newEmpresa;
	}

	@Override
	public List<EmpresaBean> findAllEmpresas() {
		List<T006_Empresa> listBusiness = empresaRepository.findAllBusiness();
		List<EmpresaBean> listadoEmpresas = new ArrayList<EmpresaBean>();
		for (T006_Empresa item : listBusiness ) {
			EmpresaBean empresa = EmpresaConverter.parseConverter_FromPojoToBean(item);
			listadoEmpresas.add(empresa);
		}
		return listadoEmpresas;
	}

}
