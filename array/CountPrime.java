package array;

public class CountPrime {

	public static boolean prime(int num) {
		for(int i=2;i<num;i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int count(int [] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (prime(arr[i])) {
				count++;
			}
		}
		return count;
	}
	public static void main(String [] args) {
		int [] a= {3,5,7,8,6,9,13,46,12};
		System.out.println("Count of Prime Numbers -: "+count(a));
	}
}
