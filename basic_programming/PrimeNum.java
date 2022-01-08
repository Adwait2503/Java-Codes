package basic_programming;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		boolean IsPrime=true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				IsPrime=false;
				break;
			}
			else {
				IsPrime=true;
			}
		}
		if (IsPrime==false) {
			System.out.println(n+" is Not - Prime.");
		}
		else {
			System.out.println(n+" is Prime.");
		}

	}

}
