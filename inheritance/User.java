package inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageRead messageRead = new MessageRead();
		messageRead.text();
		messageRead.msgRecieved();
		messageRead.msgRead();
		System.out.println("-------------------------");
		MessageRecieved messageRecieved = new MessageRecieved();
		messageRecieved.text();
		messageRecieved.msgRecieved();
	}

}
