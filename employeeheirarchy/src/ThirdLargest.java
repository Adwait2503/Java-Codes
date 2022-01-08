
public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 12, 23, 34, 45 };
		int thirdLargest = arr[0];
		int secondLargest = arr[0];
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if (secondLargest < arr[i]) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if (thirdLargest < arr[i]) {
				thirdLargest = arr[i];
			}

		}
		System.out.println("largest :" + largest);
		System.out.println("second largest :" + secondLargest);
		System.out.println("third largest :" + thirdLargest);
	}

}
