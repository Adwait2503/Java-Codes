package com.te.crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		Connection connection = null;
		CallableStatement callableStatement = null;
		try {
			connection = DriverManager.getConnection(url, "root", "tiger");
			callableStatement = connection.prepareCall("call put(?,?,?,?)");
			// Taking Input
			Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.println("Enter the ID");
				int id = scanner.nextInt();
				if (id == 0) {
					break;
				}
				System.out.println("Enter the name of the sweet");
				String name = scanner.next();
				System.out.println("Enter the Cost");
				double cost = scanner.nextDouble();
				System.out.println("Enter The Quantity");
				int qty = scanner.nextInt();
				// Assigning Values
				callableStatement.setInt(1, id);
				callableStatement.setString(2, name);
				callableStatement.setDouble(3, cost);
				callableStatement.setInt(4, qty);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
