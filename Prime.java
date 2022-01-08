
public class Prime {

	public static boolean prime(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int num=9;
		if(prime(num)) {
			System.out.println("The Entered number is Prime...");
	}else {
		System.out.println("The Entered number is Not-Prime...");
	}
	}

}
