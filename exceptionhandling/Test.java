package exceptionhandling;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int x;
		int y;
		System.out.println("Main Begin");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st Number -:");
		x = sc.nextInt();
		System.out.println("Enter The 2nd Number -:");
		y = sc.nextInt();
		try {
			int result = x / y;
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("It's Infinity...");
		}
		System.out.println("Main End");
	}
}
