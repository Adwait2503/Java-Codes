package basic_programming;

public class StrongNumberCount {

	public static int fact(int a) {
	int fact=1;
	for (int i = 2; i <= a; i++) {
		fact=fact*i;
	}
	return fact;
	}
	public static boolean strong(int b) {
		int temp=b,sum=0;
		while (temp!=0) {
			int d=temp%10;
			sum=sum+fact(d);
			temp=temp/10;
		}
		if (b==sum) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100,num2=500,count=0;
		for (int i = num1; i <=num2; i++) {
			if (strong(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(""+count);
	}

}
