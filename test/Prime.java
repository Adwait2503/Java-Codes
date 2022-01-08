package test;

public class Prime {

	public static boolean prime(int a) {
		for(int i=2;i<a;i++) {
			if (a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		int num=12;
		if (prime(num)) {
			System.out.println(num+" is a Prime Number...");
		}
		else {
			System.out.println(num+" is Not a Prime Number...");
		}
	}
}
