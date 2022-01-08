package brandoutlet;

import java.util.Scanner;

public class Buyer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Showroom showroom = new Showroom();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which car would you like to see sir/mam?");
		String name = scanner.next();
		showroom.sales(name);
	}

}
