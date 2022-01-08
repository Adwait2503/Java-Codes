package loosecoupling;

public class LanEvo extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Key Start");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Stiff Clutch");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Rally Braking System");
	}

}
