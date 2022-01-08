package test;

public class SunnyNumber {

	public static void main(String [] args) {
		int num=24,num1=num+1,flag=1;
		for(int i=2;i<=num1/2;i++) {
			if(num1==i*i) {
				flag=0;
				System.out.println(num+" is a Sunny Number...");
				break;
			}
		}
		if (flag==1) {
			System.out.println(num+" is Not a Sunny Number...");
		}
	}
}
