package hasarelationship;

public class Battery {

	double mHa;
	double volt;
	String brand;

	public Battery(double mHa, double volt, String brand) {
		super();
		this.mHa = mHa;
		this.volt = volt;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Battery [mHa=" + mHa + ", volt=" + volt + ", brand=" + brand + "]";
	}

}
