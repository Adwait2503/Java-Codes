package pattern;

public class AT1 {

	public static void main(String [] args) {
		int num=4;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if (i>=j) {
					System.out.print(j);
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}
