package array;

public class Count {

	public static int coeven(int [] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				count++;
			}
		}
		return count;
	}
	public static int coood(int [] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2!=0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String [] args) {
		int [] a= {1,6,8,7,5,8};
		System.out.println("The Number of Even Numbers are -: "+coeven(a));
		System.out.println("The Number of Ood Numbers are -: "+coood(a));
	}
}
