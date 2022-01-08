package array;

public class A4 {

	public static void main(String []args) {
		int [] array= {15,2,3,43,56,78,-10,98,100};
		int smallest=array[0];
		for (int i = 0; i < array.length; i++) {
			if (smallest>array[i]) {
				smallest=array[i];
			}
		}
		System.out.println("Smallest Element is "+smallest);
	}
}
