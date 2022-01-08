package hasarelationship;

public class Owner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery battery = new Battery("Lipo", 3.6, 12.4);
		Processor processor = new Processor("Intel", 8, 3.6);
		Laptop laptop = new Laptop(45000, battery, processor);
		System.out.println(laptop);
	}

}
