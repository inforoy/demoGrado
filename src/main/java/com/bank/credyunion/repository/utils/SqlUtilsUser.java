package com.bank.credyunion.repository.utils;

public final class SqlUtilsUser {

    private static final String SQL_INSERT_USER = " INSERT INTO  "
    		+ " USUARIO ( id_usuario, usuario, contrasenia, nombres, apellido_paterno, apellido_materno, indicador_eliminacion ) "
    		+ " VALUES ( ? , ? , ?  ,?  ,?  , ?  , ? ) ";
    
    private static final String SQL_UPDATE_USER = " UPDATE USUARIO  "
    		+ " SET  nombres = ?, apellido_paterno = ? , apellido_materno = ?  "
    		+ " WHERE id_usuario = ? ";
    
    private static final String SQL_DELETE_USER = " UPDATE USUARIO  "
    		+ " SET  indicador_eliminacion = ?  "
    		+ " WHERE id_usuario = ?  ";
    
    private static final String SQL_FIND_USER_BY_ID = " SELECT id_usuario, usuario, contrasenia, nombres, apellido_paterno, apellido_materno, indicador_eliminacion FROM USUARIO  "
    		+ " WHERE id_usuario = ? ";
    
    private static final String SQL_FIND_ALL_USERS = " SELECT id_usuario, usuario, contrasenia, nombres, apellido_paterno, apellido_materno, indicador_eliminacion FROM USUARIO ";
    
    private static final String SQL_COUNT = " SELECT COUNT(*) FROM USUARIO ";
    
    private SqlUtilsUser(){}
    
    public static String getSQLRegisterUser() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_INSERT_USER);
		return query.toString();
    }
    
    public static String getSQLUpdateUser() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_UPDATE_USER);
		return query.toString();
    }
    
    public static String getSQLDeleteUser() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_DELETE_USER);
		return query.toString();
    }
    
    public static String getSqlFindUserById() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_FIND_USER_BY_ID);
		return query.toString();
    }
    
    public static String getSqlFindAllUsers() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_FIND_ALL_USERS);
		return query.toString();
    }
    
    public static String getSqlCount() {
		StringBuilder query = new StringBuilder();
		query.append(SQL_COUNT);
		return query.toString();
    }
    
}
