package pattern;

public class AT6 {

	public static void main(String [] args) {
		int row=5,col=5,n=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1 ||i==row || j==1 || j==col) {
					System.out.print("*");
				}
				else {
				System.out.print(n++);
				}
			}
			System.out.println();
		}
	}
}
