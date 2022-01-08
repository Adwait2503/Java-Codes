package array;

public class A3 {

	public static void main(String [] args) {
		int [] array= {12,23,34,45,56,67,78,89,19};
		int largest=array[0];
		for(int i=0;i<array.length;i++) {
			if(largest<array[i]) {
				largest=array[i];
			}
		}
		System.out.println("The Largest Element is "+largest);
	}
}
