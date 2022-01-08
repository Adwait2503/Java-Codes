package array;

public class ReversedArrayReference {

	public static int[] reverse(int []a) {
		int i=0,j=a.length-1;
		while(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return a;
	}
	public static void print(int [] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
	public static void main(String [] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Before Reversing the Array...");
		System.out.println("Reference of Array "+arr);
		print(arr);
		System.out.println("After Reversing the Array");
		System.out.println("Reference of Reverse Array "+reverse(arr));
		print(arr);
	}
}
