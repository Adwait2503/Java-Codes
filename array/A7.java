package array;

public class A7 {

	public static int smallest(int [] small) {
		int i=0,sm=small[0];
		for ( i = 0; i < small.length; i++) {
			if (sm>small[i]) {
				sm=small[i];
			}
		}
		return sm;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,-10,-222,453,1000};
		System.out.println("The Smallest Element is -: "+smallest(arr));
	}
}
