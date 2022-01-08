
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {21,32,12,34,54,77,-10,67,45};
int largest=arr[0];
int secondLargest=arr[0];
int thirdLargest=arr[0];
for (int i = 0; i < arr.length; i++) {
	if (largest<arr[i]) {
		thirdLargest=secondLargest;
		secondLargest=largest;
		largest=arr[i];
	} else if (secondLargest<arr[i]) {
		thirdLargest=secondLargest;
		secondLargest=arr[i];
	} else if (thirdLargest<arr[i]) {
		thirdLargest=arr[i];
	}
}
System.out.println(largest);
System.out.println(secondLargest);
System.out.println(thirdLargest);
	}

}
