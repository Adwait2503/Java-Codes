package test;
import java.util.Scanner;
public class Factorial {

	public static int fact(int a) {
		int fact=1;
		if(a==0) {
			return 1;
		}
		return fact=a*fact(--a);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number of your Choice :");
		int num=sc.nextInt();
		System.out.println("The Factorial of "+num+" is "+fact(num));
	}
}
