
public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 5, 6, 8, 1, 7, 9, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
