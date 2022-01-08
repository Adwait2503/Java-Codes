package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement createStatement = null;
		// 1 st step loading or register the driver
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// create a connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=tiger");

			// 3 rd step creating a platform (statement)
			createStatement = connection.createStatement();

			// execute query
			createStatement.execute("create table Sweets (id int primary key,name varchar(40),cost double,quantity int)");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			if (createStatement != null) {
				try {
					createStatement.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

}
