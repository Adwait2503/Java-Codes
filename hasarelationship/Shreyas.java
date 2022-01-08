package hasarelationship;

public class Shreyas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor processor = new Processor("AMD", 10, 3.0);
		HardDisk hardDisk = new HardDisk("Seagate", 2, "HHD");
		OperatingSystem operatingSystem = new OperatingSystem("Linux", 16, 64);
		Battery battery = new Battery(32000, 4, "Toshiba");
		Laptop laptop = new Laptop(450000, battery, operatingSystem, hardDisk, processor);
		System.out.println(laptop);
	}

}
