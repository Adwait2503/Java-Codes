package pattern;

public class P10 {

	public static void main(String [] args) {
		int row=4,column=4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if (i+j>=column+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}