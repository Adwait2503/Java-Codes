package test;

public class Fibonacci {

	public static void main(String [] args) {
		int num=0,num1=1,fib=0;
		while(num<=10) {
			System.out.println(num);
			fib=num+num1;
			num=num1;
			num1=fib;
		}
	}
}
