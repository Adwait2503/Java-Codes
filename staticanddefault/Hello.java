package staticanddefault;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneCall pc = new Maharashtra();
		PhoneCall pc1 = new Karantaka();
		PhoneCall pc2 = new TamilNadu();
		pc.busyMessage();
		pc1.busyMessage();
		pc2.busyMessage();
		System.out.println("===========");
		pc.covidAlert();
		pc1.covidAlert();
		pc2.covidAlert();
	}

}
