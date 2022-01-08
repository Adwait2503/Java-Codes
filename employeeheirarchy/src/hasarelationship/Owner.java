package hasarelationship;

public class Owner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor processor = new Processor("AMD", 4, 3.60);
		Battery battery = new Battery(3500, 4.2, "Liapo");
		OperatingSystem operatingSystem = new OperatingSystem("Linux", 16.4, 64);
		HardDisk hardDisk = new HardDisk("Seagate", 2, "SSD");
		Laptop laptop = new Laptop(45000, battery, operatingSystem, processor, hardDisk);
		System.out.println(laptop);
	}

}
