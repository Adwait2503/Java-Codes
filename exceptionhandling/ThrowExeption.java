package exceptionhandling;

public class ThrowExeption {
	public void demo() throws Exception{
		System.out.println("Don't know...");
		throw new StringIndexOutOfBoundsException(null);
	}
public static void main(String[] args) {
	System.out.println("Who did it?");
	ThrowExeption exeption = new ThrowExeption();
	try {
	exeption.demo();
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
		System.out.println("Hahaha");
	}
}
}
