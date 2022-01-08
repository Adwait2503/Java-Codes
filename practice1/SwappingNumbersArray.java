package practice1;

import java.util.Scanner;

class SwappingNumbersArray {

	public static void main(String[] args) {
		int i, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the Elements in the Array");
		for (int i1 = 0; i1 < a.length; i1++) {
			a[i1] = sc.nextInt();
		}
		i = 0;
		while (i < a.length - 1) {
			t = a[i];
			a[i] = a[i + 1];
			a[i + 1] = t;
			i += 2;
		}
		System.out.println("=========================");
		System.out.println("After Swapping");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}