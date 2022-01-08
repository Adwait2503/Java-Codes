package hasarelationship;

public class Processor {

	String brand;
	int core;
	double clock;

	public Processor(String brand, int core, double clock) {
		super();
		this.brand = brand;
		this.core = core;
		this.clock = clock;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", core=" + core + ", clock=" + clock + "]";
	}

}
