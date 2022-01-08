package runnablethread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable myThread = new MyThread();
		Thread currentThread = Thread.currentThread();
		System.out.println("The Name of the Current Thread is :" + currentThread.getName());
		currentThread.setName("Chotta Bheem");
		System.out.println("The Name of The Current Thread is :" + currentThread.getName());
		Thread thread = new Thread(myThread);
		thread.setName("Chutki");
		thread.start();
		System.out.println("The threadid is :" + currentThread.getId());

	}

}
