package pattern;

public class P6 {

	public static void main(String [] args) {
		int num=4;
		for(int i=1;i<=num;i++) {
			int n=1;
			char ch='a';
			for(int j=1;j<=num;j++) {
				if (j%2!=0) {
					System.out.print(n++);
				}
				else {
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
	}
}
