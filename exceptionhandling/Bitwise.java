package exceptionhandling;

import java.util.Scanner;

public class Bitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number -:");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd Number -:");
		int y = sc.nextInt();
		try {
			int result = x / y;
			int[] arr = new int[result];
			arr[4] = 50;
			System.out.println(arr[4]);
			System.out.println(result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			if (e instanceof ArithmeticException) {
				System.out.println(e);
			} else {
				System.out.println(e);
			}
		}
	}
}
