package com.jdbc.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	private static final String PATH = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/projectemployee";
	private static final String PASSWORD = "root";
	private static final String USERNAME = "root";
	
	public DBconnection() {
		try {
			Class.forName(PATH);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Something Went Wrong in DBconnection...! "+e);
		}
	}
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
}
