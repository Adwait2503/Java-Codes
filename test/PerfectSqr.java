package test;

public class PerfectSqr {

	public static void main(String [] args) {
		int num=25,flag=1;
		for(int i=2;i<=num/2;i++) {
			if(num==i*i) {
				flag=0;
				System.out.println(num+" is a Perfect Square...");
				break;
			}
		}
		if(flag==1) {
		System.out.println(num+" is Not a Perfect Square...");
		}
	}
}
