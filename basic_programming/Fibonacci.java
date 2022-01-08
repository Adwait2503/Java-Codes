package basic_programming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1;
		System.out.println("The Fibonacci Series is :-");
		while (num1<=10) {
			System.out.println(num1);
			int fib=num1+num2;
			num1=num2;
			num2=fib;
		}

	}

}
