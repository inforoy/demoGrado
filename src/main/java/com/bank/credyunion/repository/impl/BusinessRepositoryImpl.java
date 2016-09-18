package com.bank.credyunion.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.bank.credyunion.domain.T006_Empresa;
import com.bank.credyunion.repository.BusinessRepository;
import com.bank.credyunion.repository.mapper.BusinessMapper;
import com.bank.credyunion.repository.utils.SqlUtilsBusiness;

@Repository("empresaRepository")
public class BusinessRepositoryImpl implements BusinessRepository {

	private static final int SQL_PARAMS_UNO = 1;
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	public boolean registerBusiness(T006_Empresa empresa) {
		String sqlInsert = SqlUtilsBusiness.getSQLRegisterBusiness();
		int result = jdbcTemplate.update(sqlInsert, new Object[] {
				empresa.getIdEmpresa(),
				empresa.getDescripcion(),
				empresa.getFechaDeCreacion(),
				empresa.getIndicadorEliminacion()
			} );
		return result > 0 ? true : false;
	}

	public boolean updateBusiness(T006_Empresa empresa) {
		String sqlUpdate = SqlUtilsBusiness.getSQLUpdateBusiness();
		int result = jdbcTemplate.update(sqlUpdate,new Object[] {
				empresa.getDescripcion(),
				empresa.getFechaDeCreacion(),
				empresa.getIndicadorEliminacion()
			});
		return result > 0 ? true : false;
	}

	public boolean deleteBusiness(T006_Empresa empresa) {
		String sqlDelete = SqlUtilsBusiness.getSQLDeleteBusiness();
		int result = jdbcTemplate.update(sqlDelete,new Object[] {
				empresa.getIndicadorEliminacion(),
				empresa.getIdEmpresa()
			});
		return result > 0 ? true : false;
	}

	public T006_Empresa findBusinessById(T006_Empresa empresa) {
		String sqlFindUserById = SqlUtilsBusiness.getSqlFindBusinessById();
		List<T006_Empresa> listBusiness = new ArrayList<T006_Empresa>();
		
        List<Map<String, Object>> rowBusiness = jdbcTemplate.queryForList(sqlFindUserById, new Object[] { 
        		empresa.getIdEmpresa()
    	} );
        listBusiness = new BusinessMapper().listBusinessMapper(rowBusiness);
    	if (!CollectionUtils.isEmpty(listBusiness))	{
    		empresa = listBusiness.get(0);
    	}
		return empresa;
	}

	public List<T006_Empresa> findAllBusiness() {
		String sqlFindAllBusiness = SqlUtilsBusiness.getSqlFindAllBusiness();
		List<T006_Empresa> listAllBusiness = new ArrayList<T006_Empresa>();
		List<Map<String, Object>> rowBusiness = jdbcTemplate.queryForList(sqlFindAllBusiness);
		listAllBusiness = new BusinessMapper().listBusinessMapper(rowBusiness);
		return listAllBusiness;
	}

	@SuppressWarnings("deprecation")
	public int getNextBusiness() {
		String sqlCountBusiness = SqlUtilsBusiness.getSqlBusinessCount();
		int count = jdbcTemplate.queryForInt(sqlCountBusiness);
		count = count + SQL_PARAMS_UNO;
		return count;
	}
	
}