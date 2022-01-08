package loosecoupling;

public class Audi extends Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Button Start...");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Smooth Acceleration");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("6psi");
	}

}
