package com.jdbc.Main;

import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.Model.Employee;
import com.jdbc.Service.Service;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("-: ENTER THE CHOICE :-");
				System.out.println("1. insert");
				System.out.println("2. selectAll");
				System.out.println("3. select ByID");
				System.out.println("4. update");
				System.out.println("5. delete");
				System.out.println("6. exit");
				System.out.println("======================");

				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					Service.insertEmployee(new Employee(scanner.next(), 
							scanner.nextInt(), scanner.next(), scanner.next(), 
							scanner.nextLong()));
					break;
				case 2:
					Service.selectAll();
					break;
				case 3:
					System.out.println("Enter the id of employee :- ");
					int id = scanner.nextInt();
					Service.selectById(id);
					break;
				case 4:
					System.out.println("Enter the id of employee : -");
					int updateID = scanner.nextInt();
					boolean isfound =	Service.selectById(updateID);
					System.out.println("Enter the Name");
					String name = scanner.next();
					System.out.println("Enter the Age");
					int age =scanner.nextInt();
					System.out.println("Enter the email");
					String email = scanner.next();
					System.out.println("Enter the Designation");
					String designation = scanner.next();
					System.out.println("Enter the Number");
					long number = scanner.nextLong();
					if(isfound) {
						Service.updateById(new Employee(updateID, name, age, email, designation, number));
					}
					break;
				case 5:
					System.out.println("Enter the id of employee : - ");
					Service.deleteById(scanner.nextInt());
					break;
				case 6:
					System.out.println("THANK YOU and RUN THE CODE AGAIN......!");
					System.exit(0);
					break;

				default:
					System.out.println("You entered Invalid choice");
					break;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
