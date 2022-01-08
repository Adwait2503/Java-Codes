package loosecoupling;

public class Audi extends Cars {

	@Override
	public void starts() {
		// TODO Auto-generated method stub
		System.out.println("It is Button Starts");
	}

	@Override
	public void accelerates() {
		// TODO Auto-generated method stub
		System.out.println("The Acceleration is Smooth");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The brakes are 6psi");
	}

}
