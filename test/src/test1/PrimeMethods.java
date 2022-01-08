package test1;

public class PrimeMethods {

	public static int prime(int a) {
		for(int i=2;i<a;i++) {
			if (a%i==0) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String [] args) {
	System.out.println(prime(9));
	System.out.println(prime(7));
	System.out.println(prime(15));
	}
}
