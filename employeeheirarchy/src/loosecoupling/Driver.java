package loosecoupling;

public class Driver {

	public void driver(Cars cars) {
		cars.starts();
		cars.accelerates();
		cars.brake();
	}
}
