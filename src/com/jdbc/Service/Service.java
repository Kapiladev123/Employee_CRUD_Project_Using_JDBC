package com.jdbc.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.DBconnection.DBconnection;
import com.jdbc.DBconnection.Queryconnection;
import com.jdbc.Model.Employee;

public class Service {

	static DBconnection dBconnection = new DBconnection();
	static Connection connection;
	public static void insertEmployee(Employee employee)throws SQLException {
		connection = dBconnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Queryconnection.insertquery());
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setInt(2, employee.getAge());
		preparedStatement.setString(3, employee.getEmail());
		preparedStatement.setString(4, employee.getDesignation());
		preparedStatement.setLong(5, employee.getNumber());
		int choice = preparedStatement.executeUpdate();
		if(choice!=0) {
			System.out.println("Inserted Successfully");
		}
		else {
			System.out.println("failed to insert");
		}
	}

	public static void selectAll() throws SQLException {
		connection = dBconnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Queryconnection.selectall());
		ResultSet set =  preparedStatement.executeQuery();
		while(set.next()) {
			System.out.println("Employee Id :- "+set.getInt(1));
			System.out.println("Employee Name :- "+set.getString(2));
			System.out.println("Employee Age :- "+set.getString(3));
			System.out.println("Employee Email :- "+set.getString(4));
			System.out.println("Employee Designation :- "+set.getString(5));
			System.out.println("Employee Number :- "+set.getLong(6));
			
			System.out.println("================");
		}
	}

	public static boolean selectById(int id) throws SQLException {
		boolean isfound = false;
		connection =dBconnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Queryconnection.selectById(id));
//		preparedStatement.setInt(1, id);
		ResultSet set = preparedStatement.executeQuery();
		if(set.next()) {
			isfound = true;
			System.out.println("Employee Id :- "+set.getInt(1));
			System.out.println("Employee Name :- "+set.getString(2));
			System.out.println("Employee Age :- "+set.getString(3));
			System.out.println("Employee Email :- "+set.getString(4));
			System.out.println("Employee Designation :- "+set.getString(5));
			System.out.println("Employee Number :- "+set.getLong(6));
			System.out.println();
			System.out.println("================");
		}
		else {
			System.out.println("ID "+id+" is not valid... PLEASE enter valid ID");
		}
		return isfound;
	}

	public static void deleteById(int id) throws SQLException {
		connection = dBconnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Queryconnection.deleteById(id));
		preparedStatement.setInt(1, id);
		int count =	preparedStatement.executeUpdate();
		if(count!=0) {
			System.out.println("Record Deleted Successfully");
		}
		else {
			System.out.println("Failed To Delete");
		}
	}
	
	public static void updateById(Employee employee)  throws SQLException{
		connection = dBconnection.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(Queryconnection.updateById(employee.getId()));
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setInt(2, employee.getAge());
		preparedStatement.setString(3, employee.getEmail());
		preparedStatement.setString(4, employee.getDesignation());
		preparedStatement.setLong(5, employee.getNumber());
		int choice = preparedStatement.executeUpdate();
		if(choice!=0) {
			System.out.println("Updated  Successfully");
		}
		else {
			System.out.println("failed to Update");
		}
		
	}
}
