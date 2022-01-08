
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2012;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " is a Leap Year.");
		} else {
			System.out.println(year + " is Not a Leap Year.");
		}
	}

}
