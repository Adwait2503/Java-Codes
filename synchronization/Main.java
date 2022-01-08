package synchronization;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Account account = new Account(10000 );
		BoyFriend boyFriend = new BoyFriend(account);
		GirlFriend girlFriend = new GirlFriend(account);
		boyFriend.start();
		girlFriend.start();
		boyFriend.join();
		girlFriend.join();
		System.out.println("Execution is Done");
		account.checkBalance();
	}

}
