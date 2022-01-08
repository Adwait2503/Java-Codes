package test;
import java.util.Scanner;
public class Prime {

	public static int prime(int a) {
	for(int i=2;i<a;i++) {
		if (a%i==0) {
			return i;
		}
	}
	return 0;
	}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number of your Choice :");
	int num=sc.nextInt();
	System.out.println(prime(num));
	System.out.println("Enter a Number of your Choice :");
	int num1=sc.nextInt();
	System.out.println(prime(num1));
	System.out.println("Enter a Number of your Choice :");
	int num2=sc.nextInt();
	System.out.println(prime(num2));
	}
}
