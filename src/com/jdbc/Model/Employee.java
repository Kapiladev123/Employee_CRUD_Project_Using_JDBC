package com.jdbc.Model;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String email;
	private String designation;
	private long number;
	
	
	
	public Employee(int id, String name, int age, String email, String designation, long number) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.designation = designation;
		this.number = number;
	}
	public Employee(String name, int age, String email, String designation, long number) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.designation = designation;
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", designation="
				+ designation + ", number=" + number + "]";
	}
	
	
}
