package test;

public class Palindrome {

	public static boolean palin(int a) {
		int rev=0,temp=a;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp=temp/10;
			if (rev==a) {
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args) {
		int num=12321;
		if (palin(num)) {
			System.out.println(num+" is a Palindrome...");
		}
		else {
			System.out.println(num+" is Not Palindrome...");
		}
	}
}
