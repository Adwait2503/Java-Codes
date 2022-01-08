package pattern;

public class AT7_1 {

	public static void main(String [] args) {
		int row=4,col=4,n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=col;j++) {
				if (i!=3) {
					System.out.print(i);
				}
			}
			if(i!=3) {
				System.out.println();
			}
		}
	}
}
