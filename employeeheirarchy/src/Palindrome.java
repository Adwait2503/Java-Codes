
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 151;
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}

}
