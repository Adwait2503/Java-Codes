package basic_programming;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=26;
		a=--a + ++a;
		int b=a++;
		int c=--b + ++a;
		c=c++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
