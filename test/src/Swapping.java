
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6,7,8 };
		int i = 0;
		int temp;
		while (i < arr.length) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
			i += 2;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
