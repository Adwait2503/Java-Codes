package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement createStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","tiger");
			createStatement = connection.createStatement();
			boolean execute = createStatement.execute("insert into sweets values (1,'Mysorepack',10,1)");
			boolean execute2 = createStatement.execute("insert into sweets values (2,'Gulab Jamun',30,1)");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				if (createStatement != null) {
					try {
						createStatement.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		}
	}

}
