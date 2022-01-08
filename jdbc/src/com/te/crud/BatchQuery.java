package com.te.crud;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class BatchQuery {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url="jdbc:mysql://localhost:3306/jdbcdemo";
Connection connection=null;
Statement statement=null;
try {
	FileReader fileReader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
	Properties properties = new Properties();
	properties.load(fileReader);
	connection=DriverManager.getConnection(url,properties);
	statement=connection.createStatement();
	statement.addBatch("insert into employees values (101,'Aayush')");
	statement.addBatch("insert into employees values (102,'Rakshit')");
	statement.addBatch("insert into employees values (103,'Aayush')");
	statement.addBatch("update employees set name='Yash' where id=103");
	statement.executeBatch();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
