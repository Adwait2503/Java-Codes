package exceptionhandling;

public class Blocked extends RuntimeException {
	String message;

	Blocked(String message) {
		this.message = message;
	}
}
