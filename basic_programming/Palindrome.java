package basic_programming;

public class Palindrome {

	public static boolean palin(int a) {
		int rev=0,temp=a;
		while (temp!=0) {
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		if (a==rev) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100,num2=500;
		for (int i = num1; i <=num2; i++) {
			if (palin(i)) {
				System.out.println(i);
			}
		}

	}

}
