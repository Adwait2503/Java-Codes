package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsertion {

	public static void main(String[] args) throws Throwable {
		Connection connection = null;
		PreparedStatement statement = null;
		Scanner sc = new Scanner(System.in);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "tiger");
		connection.prepareStatement("insert int sweets values (?,?,?,?)");
		System.out.println("Enter the id of the sweet");
		int id = sc.nextInt();
		System.out.println("Enter the name of the sweet");
		String name = sc.nextLine();
		System.out.println("Enter the price");
		double cost = sc.nextDouble();
		System.out.println("Enter the Quantity");
		int qty = sc.nextInt();
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setDouble(3, cost);
		statement.setInt(4, qty);
	}
}
