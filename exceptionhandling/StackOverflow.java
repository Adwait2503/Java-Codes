package exceptionhandling;

public class StackOverflow {
	static int count;

	public static void main(String[] args) {
		System.out.println("Hello " + count++);
		try {
			main(null);
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Hello How Do You Dooo");
		}
	}
}
