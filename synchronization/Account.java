package synchronization;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amount;
		}
	}

	synchronized public void deposit(double amount) {
		balance += amount;
	}

	public void checkBalance() {
		System.out.println(balance);
	}
}
