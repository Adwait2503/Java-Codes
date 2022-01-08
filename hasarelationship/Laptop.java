package hasarelationship;

public class Laptop {
	double cost;
	private Battery battery;
	private OperatingSystem os;
	private HardDisk hardDisk;
	private Processor processor;
	public Laptop(double cost, Battery battery, OperatingSystem os, HardDisk hardDisk, Processor processor) {
		super();
		this.cost = cost;
		this.battery = battery;
		this.os = os;
		this.hardDisk = hardDisk;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", battery=" + battery + ", os=" + os + ", hardDisk=" + hardDisk
				+ ", processor=" + processor + "]";
	}
	
}
