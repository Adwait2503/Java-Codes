package practice;

import java.util.Scanner;

public class SpecialCharacter {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character of your Choice -:");
		char ch=sc.next().charAt(0);
		if (!((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9'))) {
			System.out.println("The entered Character is a Special Character...");
		}
		else {
			System.out.println("The entered Character is not a Special Character...");
		}
	}
}
