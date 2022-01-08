package practice1;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 45, 65, 76, 87, 9, 0, -1, -21, 46 };
		int lar = a[0], slar = a[0], tlar = a[0],smal=a[0],ssmal=a[0],tsmal=a[0];
		for (int i = 0; i < a.length; i++) {
			if (lar < a[i]) {
				tlar = slar;
				slar = lar;
				lar = a[i];
			} else if (slar < a[i]) {
				tlar = slar;
				slar = a[i];
			} else if (tlar < a[i]) {
				tlar = a[i];
			}
		}
		System.out.println(lar);
		System.out.println(slar);
		System.out.println(tlar);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (smal>a[i]) {
				tsmal=ssmal;
				ssmal=smal;
				smal=a[i];
			}else if (ssmal>a[i]) {
				tsmal=ssmal;
				ssmal=a[i];
			}else if (tsmal>a[i]) {
			tsmal=a[i];	
			}
		}
		System.out.println(smal);
		System.out.println(ssmal);
		System.out.println(tsmal);
	}
}
