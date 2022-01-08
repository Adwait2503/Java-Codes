
public class PrimeNumber {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num == 1 || num == 0) {
				return false;
			}
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 100;
		for (int i = num1; i <= num2; i++) {
			if (isPrime(i)) {
				System.out.println("The Number " + i + " is Prime.");
			}
		}
	}

}
