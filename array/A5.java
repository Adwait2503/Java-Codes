package array;

public class A5 {

	public static int linearSearch(int []a,int key) {
		for (int i = 0; i < a.length; i++) {
		if (a[i]==key) {
			return i;
		}	
		}
		return -1;
	}
	public static void main(String [] args) {
		int []array= {12,23,34,45,56,67,78,89,10};
		int key=34;
		System.out.println(linearSearch(array, key));
		System.out.println(linearSearch(array, 24));
	}
}
