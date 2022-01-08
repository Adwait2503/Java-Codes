package basic_programming;

public class ArrayRevese {

	public static void main(String [] args) {
		int [] a= {22,12,34,56,78,91,1};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
