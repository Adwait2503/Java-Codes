package test;

public class FibonacciSeries {

	public static void main(String [] args) {
		int num=0,num1=1,fib=0;
		while(num<=60) {
			System.out.println(num);
			fib=num+num1;
			num=num1;
			num1=fib;
		}
	}
}
