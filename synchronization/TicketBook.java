package synchronization;

public class TicketBook {
	int tickets = 20;

	public void bookTickets(int noOfTickets, String name) {
		System.out.println("Login Succesfull");
		System.out.println("Welcome to IRCTC");
		System.out.println("Hello " + name);
		System.out.println("The Number of Tickets Available :" + tickets);
		synchronized (this) {
			if (tickets < noOfTickets) {
				System.out.println("Tickets Not Available");
				System.out.println("=====================");
			} else {
				System.out.println("Tickets are Booked");
			}
		}
		System.out.println("The number of tickets to be booked :" + noOfTickets);
		tickets -= noOfTickets;
		System.out.println("Number of Tickets Available :" + tickets);
		System.out.println("==================");
	}
}
