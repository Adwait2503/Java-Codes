package pattern;

public class P5 {

	public static void main(String [] args) {
		int num=4;
		for(int i=1;i<=num;i++) {
			char ch='a';
			for(int j=1;j<=num;j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
