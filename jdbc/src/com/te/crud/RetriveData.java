package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		 //statement = null;
		Statement createStatement =null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "tiger");
			createStatement = connection.createStatement();
			ResultSet query = createStatement.executeQuery("select * from sweets");
			while (query.next()) {
				System.out.print(query.getString(1));
				System.out.print(query.getString(2));
				System.out.print(query.getString(3));
				System.out.println(query.getString(4));
				//System.out.println("================");
//				System.out.print(query.getInt(1));
//				System.out.print(query.getString(2));
//				System.out.print(query.getDouble(3));
//				System.out.println(query.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
