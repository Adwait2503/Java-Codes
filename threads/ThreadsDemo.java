package threads;

public class ThreadsDemo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				throw new NumberFormatException();
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
