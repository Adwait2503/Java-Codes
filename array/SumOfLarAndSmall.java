package array;

public class SumOfLarAndSmall {

	public static int sum(int []a) {
		int largest=a[0],smallest=a[0],sum=0;
		for (int i = 0; i < a.length; i++) {
			if(largest<a[i]) {
				largest=a[i];
			}
			if (smallest>a[i]) {
				smallest=a[i];	
			}
		}
		System.out.println("Largest Element "+largest);
		System.out.println("Smallest Element "+smallest);
		return sum=largest+smallest;
	}
	public static void main(String [] args) {
		int [] arr={1,2,3,4,5,6,12,32,-10};
		System.out.println(sum(arr));
	}
}
