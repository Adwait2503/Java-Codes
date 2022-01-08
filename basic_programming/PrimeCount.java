package basic_programming;

public class PrimeCount {

	public static boolean prime(int a) {
		for (int i = 2; i < a; i++) {
			if (a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100,num2=500,count=0;
		for (int i = num1; i <=num2; i++) {
			if (prime(i)) {
				count++;
			}
		}
		System.out.println("The Count of Prime Numbers Between "+num1+" and "+num2+" are :- "+count);

	}

}
