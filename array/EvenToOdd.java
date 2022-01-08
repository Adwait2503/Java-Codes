package array;

public class EvenToOdd {

	public static int coeven(int [] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				count++;
			}
		}
		return count;
	}
	public static int[] conv(int [] b) {
		int size=coeven(b);
		int [] c=new int[size];
		int j=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i]%2==0) {
				c[j]=b[i]+1;
				j++;
			}
		}
		return c;
	}
	public static void main(String [] args) {
		int [] a= {11,12,16,18,19,11,7};
		int [] b=conv(a);
		System.out.print("[");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");	
		}
		System.out.println("]");
	}
}
