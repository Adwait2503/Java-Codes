package hasarelationship;

public class Laptop {

	double cost;
	private Battery battery;
	private OperatingSystem os;
	private Processor processor;
	private HardDisk hardDisk;

	public Laptop(double cost, Battery battery, OperatingSystem os, Processor processor, HardDisk hardDisk) {
		super();
		this.cost = cost;
		this.battery = battery;
		this.os = os;
		this.processor = processor;
		this.hardDisk = hardDisk;
	}

	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", battery=" + battery + ", os=" + os + ", processor=" + processor
				+ ", hardDisk=" + hardDisk + "]";
	}

}
