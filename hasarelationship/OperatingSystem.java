package hasarelationship;

public class OperatingSystem {
	String brand;
	double version;
	double bit;

	public OperatingSystem(String brand, double version, double bit) {
		super();
		this.brand = brand;
		this.version = version;
		this.bit = bit;
	}

	@Override
	public String toString() {
		return "OperatingSystem [brand=" + brand + ", version=" + version + ", bytes=" + bit + "]";
	}
}
