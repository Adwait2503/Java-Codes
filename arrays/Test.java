package arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 123, 23, 21, 16, 78, 66, 7, 8, 999, 0, -45, -100, 1000, 575 };
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (smallest > a[i]) {
				smallest = a[i];
			}
		}
		System.out.println(smallest);
	}

}
