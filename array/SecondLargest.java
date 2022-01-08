package array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String [] ags) {}
		
		int largest=arr[0],slargest=arr[0],tlargest=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(largest<arr[i]) {
				tlargest=slargest;
				slargest=largest;
				largest=arr[i];
			}
			else if (slargest<arr[i] && arr[i] != largest) {
				tlargest = slargest;
				slargest = arr[i];
			} else if (tlargest < arr[i] && arr[i] != slargest) {
				tlargest = arr[i];
			}
		}
		System.out.println("Largest Element -: " + largest);
		System.out.println("Second Largest Element -: " + slargest);
		System.out.println("Third Largest Element -: " + tlargest);
	}
}
