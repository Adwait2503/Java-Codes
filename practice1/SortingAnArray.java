package practice1;

public class SortingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 6, 5, 8, 0, 7, 8, 2, 9, 11, 2 };
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
