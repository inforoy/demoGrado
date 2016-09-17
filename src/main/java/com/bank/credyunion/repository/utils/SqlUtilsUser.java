package com.bank.credyunion.repository.utils;

public final class SqlUtilsUser {

    private static final String SQL_USER_INSERT = " INSERT INTO  "
    		+ " USUARIO ( id_usuario, usuario, contrasenia, nombres, apellido_paterno, apellido_materno, indicador_eliminacion ) "
    		+ " VALUES ( ? , ? , ?  ,?  ,?  , ?  , ? ) ";
    
    private static final String SQL_USER_UPDATE = " UPDATE USUARIO  "
    		+ " SET  nombres = ?, apellido_paterno = ? , apellido_materno = ?  "
    		+ " WHERE id_usuario = ? ";
    
    private static final String SQL_USER_DELETE = " UPDATE USUARIO  "
    		+ " SET  indicador_eliminacion = ?  "
    		+ " WHERE id_usuario = ?  ";
    
    private static final String SQL_USER_FIND_BY_ID = " SELECT id_usuario, usuario, contrasenia, nombres, apellido_paterno, apellido_materno, indicador_eliminacion FROM USUARIO  "
    		+ " WHERE id_usuario = ? ";
    
    private static final String SQL_USERS_FIND_ALL = " SELECT id_usuario, usuario, contrasenia, nombres, apellido_paterno, apellido_materno, indicador_eliminacion FROM USUARIO ";
    
    private static final String SQL_USERS_COUNT = " SELECT COUNT(*) FROM USUARIO ";
    
    private SqlUtilsUser(){}
    
    public static String getSQLRegisterUser() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_USER_INSERT);
		return query.toString();
    }
    
    public static String getSQLUpdateUser() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_USER_UPDATE);
		return query.toString();
    }
    
    public static String getSQLDeleteUser() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_USER_DELETE);
		return query.toString();
    }
    
    public static String getSqlFindUserById() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_USER_FIND_BY_ID);
		return query.toString();
    }
    
    public static String getSqlFindAllUsers() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_USERS_FIND_ALL);
		return query.toString();
    }
    
    public static String getSqlCount() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_USERS_COUNT);
		return query.toString();
    }
    
}
