package array;

public class A1 {

	public static void main(String [] args) {
		int [] a= {1,2,3,4,5,6};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("In Reverse Order...");
		for (int i =a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
