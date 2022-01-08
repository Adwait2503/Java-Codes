package practice1;

public class ReverseAnArray {
	public static void print(int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 4, 5, 7, 1, 9 };
		int i = 0, j = a.length - 1;
		while (i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		print(a);
	}

}
