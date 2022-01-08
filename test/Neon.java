package test;

public class Neon {

	public static void main(String [] args) {
		int num=9,sqr=num*num,sum=0;
		while(sqr!=0) {
			sum=sum+sqr%10;
			sqr=sqr/10;
		}
		if (num==sum) {
			System.out.println(num+" is a Neon Number...");
		}
		else {
			System.out.println(num+" is Not a Neon Number");
		}
	}
}
