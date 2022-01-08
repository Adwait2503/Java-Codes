package pattern;

import java.util.Scanner;

public class P4 {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=4;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
