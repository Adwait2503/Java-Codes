import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month of your Choice...");
		int mon = sc.nextInt();
		System.out.println("Enter a Year of your Choice...");
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " is a Leap Year ");
		} else {
			System.out.println(year + " is not a Leap Year  ");
		}
		if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
			System.out.println("There are 31 Days in the Month of " + mon);
		} else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			System.out.println("There are 30 Days in the Month of " + mon);
		} else if (mon == 2 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("There are 29 Days in the Month of " + mon);
		} else {
			System.out.println("There are 28 Days in the Month of " + mon);
		}
	}

}
