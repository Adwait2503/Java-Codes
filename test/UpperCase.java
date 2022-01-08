package test;

import java.util.Iterator;
import java.util.Scanner;

public class UpperCase {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character of your Choice -:");
		char ch=sc.next().charAt(0);
		for(int i=65;i<=65+26;i++) {
			if(i==ch) {
				System.out.println(ch+" is in Upper Case...");
				break;
			}
			else {
				System.out.println(ch+" is in Lower Case...");	
				break;
			}
		}
	}
}
