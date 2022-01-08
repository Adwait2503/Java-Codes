package loosecoupling;

public class LanEvo extends Cars {

	@Override
	public void starts() {
		// TODO Auto-generated method stub
		System.out.println("It is a Key Start");
	}

	@Override
	public void accelerates() {
		// TODO Auto-generated method stub
		System.out.println("The Acceleration is is not Smooth");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The Brakes are Ralley");
	}

}
