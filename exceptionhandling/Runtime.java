package exceptionhandling;

import java.util.Scanner;

public class Runtime {
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
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
