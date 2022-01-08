package test;

public class LeapYear {

	public static String leap(int a) {
		if (a%4==0 && a%100!=0 || a%400==0) {
			return a+" is a Leap Year...";
		}
		return a+" is Not a Leap Year...";
	}
	public static void main(String [] args ) {
		System.out.println(leap(1900));
		System.out.println(leap(1200));
		System.out.println(leap(2012));
		System.out.println(leap(2013));
	}
}
