package pattern;

public class P7 {

	public static void main(String [] args) {
		int num=4,n=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if (i>=j) {
					System.out.print(n+"	");
					n++;	
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}
