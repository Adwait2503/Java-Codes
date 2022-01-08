package pattern;

public class AT5 {

	public static void main(String [] args) {
		int row=5,col=5;
		for(int i=1;i<=row;i++) {
			int n=1;
			for(int j=1;j<=col;j++) {
				if(i>=j) {
					System.out.print(n);
					n+=2;
				}
				System.out.print(" ");
			}
		System.out.println();	
		}
	}
}
