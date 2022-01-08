package synchronization;

public class Passengers extends Thread {
	TicketBook book;
	int noOfTickets;
	String name;

	public Passengers(TicketBook book, int noOfTickets, String name) {
		super();
		this.book = book;
		this.noOfTickets = noOfTickets;
		this.name = name;
	}

	@Override
	public void run() {
		book.bookTickets(noOfTickets, name);
	}
}
