package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Main Begin");
		try {
			FileReader file = new FileReader("‪C:\\Users\\ASUS\\Desktop\\ARRAY.txt");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File Not Found");
		}
		System.out.println("Main End");
	}
}
