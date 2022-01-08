package hasarelationship;

public class Processor {

	String brand;
	int core;
	double clockSpeed;
	public Processor(String brand, int core, double clockSpeed) {
		super();
		this.brand = brand;
		this.core = core;
		this.clockSpeed = clockSpeed;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", core=" + core + ", clockSpeed=" + clockSpeed + "]";
	}
	
}
