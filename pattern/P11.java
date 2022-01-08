package pattern;

public class P11 {

	public static void main(String [] args) {
		int row=4,col=4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if (i+j<=col+1) {
					System.out.print("*");
				}
				
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
