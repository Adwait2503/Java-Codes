package threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadsDemo threadsDemo = new ThreadsDemo();
		ThreadDemo2 threadDemo2 = new ThreadDemo2();
		System.out.println("The Main Thread Priority is :" + Thread.currentThread().getPriority());
		threadsDemo.setPriority(2);
		threadDemo2.setPriority(1);
		threadsDemo.start();// Creates a new Stack
		threadDemo2.start();
	}

}
