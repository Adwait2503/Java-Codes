
public class Sorting {
	public static void main(String[] args) {
		int[] a = { 27, 8, 9, 76, 1, 0, -6, -10, 99, 1111 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("[ ");
		for (int x : a) {
			System.out.print(x+" ");
		}
		System.out.print(" ]");
	}
}
