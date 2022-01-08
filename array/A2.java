package array;

import java.util.Scanner;

public class A2 {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int [] a= {1,23,45,67,89,100,56,72,88};
			System.out.println("Enter a Number of your Choice -:");
			int num=sc.nextInt();
			int i=0,flag=0;
			for ( i = 0; i < a.length; i++) {
				if(a[i]==num) {
					flag=1;
					break;
				}
			}
			if(flag!=0) {
				System.out.println(num+" found at index "+i);
			}
			else {
				System.out.println(num+" Not found");
			}
	}
}
