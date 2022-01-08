package array;

public class A6 {

	public static int largest(int []lar) {
		int i=0,largest=lar[0];
		for (i = 0; i < lar.length; i++) {
			if (largest<lar[i]) {
				largest=lar[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		int [] arr= {12,23,34,45,5,667,78,68,92,44};
		System.out.println("The Largest Element is -: "+largest(arr));
	}

}
