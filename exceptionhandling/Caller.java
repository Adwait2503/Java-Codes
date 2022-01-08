package exceptionhandling;

public class Caller {
	public void call() {
		System.out.println("ring ring");
		throw new Blocked("The person you are trying to call is busy...");
	}

	public static void main(String[] args) {
		Caller caller = new Caller();
		try {
			caller.call();
		} catch (Blocked e) {
			// TODO: handle exception
			System.out.println(e.message);
		}
	}
}
