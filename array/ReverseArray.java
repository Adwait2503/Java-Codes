package array;

public class ReverseArray {

	public static void main(String [] args) {
		int [] arr= {1,2,3,23,0,43,45,65,76};
		System.out.println("Before Reversing the Array");
		print(arr);
		int i=0,j=arr.length-1;
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println("After Reversing the Array");
		print(arr);
	}
	public static void print(int [] a) {
		//System.out.println(a.length);
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
}
