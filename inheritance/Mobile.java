package inheritance;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		phone.cost = 1250;
		phone.color = "Matt Black";
		phone.brand = "Nokia";
		phone.sim = 1;
		phone.call();
		phone.text();
		System.out.println(phone.cost);
		System.out.println(phone.color);
		System.out.println(phone.brand);
		System.out.println();
		Smartphone smartphone = new Smartphone();
		smartphone.cost = 16000;
		smartphone.color = "Midnight Blue";
		smartphone.brand = "Samsung";
		smartphone.sim = 2;
		smartphone.call();
		smartphone.text();
		smartphone.surfing();
		smartphone.playPubg();
		System.out.println(smartphone.cost);
		System.out.println(smartphone.color);
		System.out.println(smartphone.brand);
	}

}
