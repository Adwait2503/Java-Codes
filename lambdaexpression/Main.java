package lambdaexpression;

public class Main {
	public int summation(int i, int j) {
		return i + j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test test = new Test() {

		/*
		 * @Override public void message() { // TODO Auto-generated method stub
		 * System.out.println("Namaste"); }
		 */

		// };// Anonymous Class...
		// test.message();
		Test test = new Main()::summation;
		System.out.println(test.add(50, 60));
		System.out.println("============");
		Test test1 = (i, j) -> {
			return i + j;
		};// Lambda Expression
		System.out.println(test1.add(25, 55));
		System.out.println("============");
		Runnable run = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(run);
		thread.start();
	}

}
