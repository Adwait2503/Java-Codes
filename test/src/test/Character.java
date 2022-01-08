package test;

public class Character {

	public static String check(char ch) {
		if (ch>='a' && ch<='z') {
			return ch+" is a Lower Case Alphabet";
		}
		else if (ch>='A' && ch<='Z') {
			return ch+" is a Uper Case Alphabet";
		}
		else if (ch>='0' && ch<='9') {
			return ch+" is a Digit";
		}
		return ch+" is a Special Character";
	}
	public static void main(String [] args) {
		System.out.println(check('7'));
		System.out.println(check('a'));
		System.out.println(check('A'));
		System.out.println(check('*'));
	}
}
