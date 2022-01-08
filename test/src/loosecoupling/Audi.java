package loosecoupling;

public class Audi extends Cars {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Button Start");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Acceleration is smooth");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("The Brakes are of 6psi");
	}

}
