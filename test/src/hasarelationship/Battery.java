package hasarelationship;

public class Battery {

	String brand;
	double volts;
	double mHa;
	public Battery(String brand, double volts, double mHa) {
		super();
		this.brand = brand;
		this.volts = volts;
		this.mHa = mHa;
	}
	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", volts=" + volts + ", mHa=" + mHa + "]";
	}
	
}
