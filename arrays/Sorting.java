package arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 18, 17, 45, 99, 7, 1, 10, 8, 12 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		for (int x : a) {
			System.out.println(x);
		}
	}

}
