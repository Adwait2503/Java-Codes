package com.assignment.mediaplayer_database;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Mediaplayer implements Media {

	String url = "jdbc:mysql://localhost:3306/jdbcdemo";
	Scanner scanner = new Scanner(System.in);

	@Override
	public void playlist() {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		try {
			FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.createStatement();
			ResultSet query = statement.executeQuery("select * from songs");
			System.out.println("Song Name\tSinger Name");
			while (query.next()) {
				System.out.print(query.getString(1) + "\t");
				System.out.println(query.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}

	@Override
	public boolean play() {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.prepareStatement("select song from songs where song=?");
			System.out.println("Enter the name of the song");
			String songName = scanner.nextLine();
			statement.setString(1, songName);
			ResultSet query = statement.executeQuery();
			while (query.next()) {
				System.out.println(query.getString(1) + " is playing");
				result = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.prepareStatement("insert into songs values(?,?)");
			System.out.println("Enter the song's name");
			String songName = scanner.nextLine();
			System.out.println("Enter the singer's name");
			String singerName = scanner.nextLine();
			statement.setString(1, songName);
			statement.setString(2, singerName);
			statement.executeUpdate();
			System.out.println("Song added succesfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public boolean search() {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.prepareStatement("select song from songs where song=?");
			System.out.println("Enter the song name");
			String songName = scanner.nextLine();
			statement.setString(1, songName);
			ResultSet query = statement.executeQuery();
			while (query.next()) {
				System.out.println("Here is your song -: " + query.getString(1));
				result = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.prepareStatement("update songs set song=?where song=?");
			System.out.println("Enter the song you want to change");
			String songName = scanner.nextLine();
			statement.setString(2, songName);
			System.out.println("Enter the new song name");
			String newSongName = scanner.nextLine();
			statement.executeUpdate();
			System.out.println("Song updated successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("The updated playlist is");
		playlist();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(reader);
			connection = DriverManager.getConnection(url, properties);
			statement = connection.prepareStatement("delete from songs where song=?");
			System.out.println("Enter the Song_name");
			String songName = scanner.next();
			statement.setString(1, songName);
			statement.executeUpdate();
			System.out.println("Song deleted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public boolean searchBySingerName() {
		boolean result=false;
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\Cred.txt");
			Properties properties = new Properties();
			properties.load(reader);
			connection=DriverManager.getConnection(url,properties);
			statement=connection.prepareStatement("select song fron songs where singer=?");
			System.out.println("Enter the singer's name");
			String singerName=scanner.nextLine();
			statement.setString(1, singerName);
			ResultSet query = statement.executeQuery();
			while(query.next()) {
				System.out.println(query.getString(1));
				result=true;
			}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		if (connection !=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		return result;
	}
}
