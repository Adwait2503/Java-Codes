package hasarelationship;

public class Laptop {

	double cost;
	private Battery battery;
	private Processor processor;

	public Laptop(double cost, Battery battery, Processor processor) {
		super();
		this.cost = cost;
		this.battery = battery;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [cost=" + cost + ", battery=" + battery + ", processor=" + processor + "]";
	}

}
