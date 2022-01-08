package synchronization;

public class GirlFriend extends Thread {
	Account account;

	public GirlFriend(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			account.deposit(10);
		}
		System.out.println("Girlfriend completed Deposiing");
	}
}
