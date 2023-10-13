package com.jdbc.DBconnection;

public class Queryconnection {

	public static String insertquery() {
	return 	"INSERT INTO EMPLOYEE1(NAME,AGE,EMAIL,DESIGNATION,NUMBER) VALUES(?,?,?,?,?)";
	}
	
	public static String selectall() {
		return "SELECT * FROM EMPLOYEE1";
	}
	
	public static String selectById(int id) {
		return "SELECT * FROM EMPLOYEE1 WHERE ID ="+id;
	}
	
	public static String deleteById(int id) {
		return "DELETE FROM EMPLOYEE1 WHERE ID = ?";
	}
	
	public static String updateById(int id) {
		return "UPDATE EMPLOYEE1 SET NAME=?,AGE=?,EMAIL=?,DESIGNATION=?,NUMBER=? "
				+ "WHERE ID = "+id;
	}
}
