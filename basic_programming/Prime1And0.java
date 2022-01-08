package basic_programming;

public class Prime1And0 {

	public static int prime(int a) {
	for(int i=2;i<a;i++){
		if (a%i==0) {
			return i;
		}
	}
	return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		if (prime(num)==0) {
			System.out.println("The output is => "+prime(num));
		}
		else {
			System.out.println("The output is => "+prime(num));
		}
	}
}
