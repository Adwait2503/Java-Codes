package pattern;

public class AT7 {

	public static void main(String [] args) {
		int row=4,col=4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1) {
					System.out.print(5);
				}else if (i==2) {
					System.out.print(4);
				}else if(i==3) {
					System.out.print(2);
				}else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}
}
