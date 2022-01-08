package pattern;

public class P2 {

	public static void main(String [] args) {
		int num=7;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i%2!=0) {
				System.out.print("*");
				}
				else{
				System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
