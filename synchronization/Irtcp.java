package synchronization;

public class Irtcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBook ticketBook = new TicketBook();
		Passengers yash = new Passengers(ticketBook, 10, "Yash");
		Passengers romen = new Passengers(ticketBook, 15, "Romen");
		yash.start();
		romen.start();
	}

}
