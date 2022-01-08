package brandoutlet;

public class Showroom {


	public void sales(String name) {
		if (name.equalsIgnoreCase("tamo")) {
			Tata tata = new Tamo();
			tata.engine();
			tata.transmission();
			tata.tyers();
			tata.brakes();
		}
		if (name.equalsIgnoreCase("altroz")) {
			Tata tata1 = new Altroz();
			tata1.engine();
			tata1.transmission();
			tata1.tyers();
			tata1.brakes();
		}
		if (name.equalsIgnoreCase("indigo")) {
			Tata tata = new Indigo();
			tata.engine();
			tata.transmission();
			tata.tyers();
			tata.brakes();
		}
	}
}
