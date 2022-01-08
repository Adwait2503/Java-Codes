package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=tiger");
				Statement statement = con.createStatement();) {
			statement.execute("alter table sweets rename  to Cnadani");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
