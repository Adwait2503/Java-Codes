package array;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] a = { 2, 32, 4, 8, -10, -8, 6, 5 };
		int sm = a[0], secsm = a[0], tsm = a[0];
		for (int i = 0; i < a.length; i++) {
			if (sm > a[i]) {
				tsm = secsm;
				secsm = sm;
				sm = a[i];
			} else if (secsm > a[i] && a[i] != sm) {
				secsm = a[i];
			} else if (tsm > a[i] && a[i] != tsm) {
				tsm = a[i];
			}
		}
		System.out.println("Smallest Element -: " + sm);
		System.out.println("Second Smallest Element -: " + secsm);
		System.out.println("Third Smallest Element -: " + tsm);
	}
}
