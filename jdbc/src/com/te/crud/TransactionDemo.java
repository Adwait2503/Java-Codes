package com.te.crud;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

public class TransactionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		Savepoint savepoint = null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			FileReader fileReader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.createStatement();
			connection.setAutoCommit(false);
			statement.execute("insert into trans values(1,'Biometric Unlock')");
			statement.execute("insert into trans values(2,'Entering the Pin')");
			statement.execute("insert into trans values(3,'Check Balance')");
			System.out.println("Your Balance is _________");
			savepoint = connection.setSavepoint();
			statement.execute("insert into trans values(4,'Debiting the Amount')");
			statement.execute("insert into trans values(5,'Transfering through Network')");
			statement.execute("insert into trans values(6,'Crediting the Amount')");
			System.out.println("Transaction Complete!");
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				connection.rollback(savepoint);
				connection.commit();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			System.out.println("Transaction Failed");
		}
	}

}
