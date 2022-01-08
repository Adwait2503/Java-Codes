package practice;

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
		// TODO Auto-generated method stub
		int num=4;
		if(prime(num)) {
			System.out.println("The Number "+num+" is a Prime Number");
		}
		else {
			System.out.println("The Number "+num+" is Not a Prime Number");	
		}

	}

}
