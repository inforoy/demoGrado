package com.bank.credyunion.repository.utils;

public final class SqlUtilsBusiness {

	private static final String SQL_BUSINESS_INSERT = " INSERT INTO "
    		+ " EMPRESA ( id_empresa, descripcion, fecha_creacion, indicador_emilinacion ) "
    		+ " VALUES ( ? , ? , ?  ,?   ) ";
	
	private static final String SQL_BUSINESS_UPDATE = " UPDATE EMPRESA "
    		+ " SET  descripcion = ?, fecha_creacion = ?  "
    		+ " WHERE id_empresa = ? ";
	
	private static final String SQL_BUSINESS_DELETE = " UPDATE EMPRESA "
			+ " SET  indicador_eliminacion = ?  "
    		+ " WHERE id_empresa = ?  ";
	
	private static final String SQL_BUSINESS_FIND_BY_ID = " SELECT id_empresa, descripcion, fecha_creacion, indicador_emilinacion FROM EMPRESA  "
			+ " WHERE id_empresa = ? ";
	
	private static final String SQL_BUSINESS_FIND_ALL = " SELECT id_empresa, descripcion, fecha_creacion, indicador_emilinacion FROM EMPRESA  ";
	
	private static final String SQL_BUSINESS_COUNT = " SELECT COUNT(*) FROM EMPRESA ";
	
    private SqlUtilsBusiness(){}
    
    public static String getSQLRegisterBusiness() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_BUSINESS_INSERT);
		return query.toString();
    }
    
    public static String getSQLUpdateBusiness() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_BUSINESS_UPDATE);
		return query.toString();
    }
    
    public static String getSQLDeleteBusiness() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_BUSINESS_DELETE);
		return query.toString();
    }
	
    public static String getSqlFindBusinessById() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_BUSINESS_FIND_BY_ID);
		return query.toString();
    }
    
    public static String getSqlFindAllBusiness() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_BUSINESS_FIND_ALL);
		return query.toString();
    }
    
    public static String getSqlBusinessCount() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_BUSINESS_COUNT);
		return query.toString();
    }
}