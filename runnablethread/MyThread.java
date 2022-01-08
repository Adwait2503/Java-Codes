package runnablethread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The name of the Current Thread from Runnable is :"+Thread.currentThread().getName());
		System.out.println("The Id of the Current Thread from Runnable is :"+Thread.currentThread().getId());
		/*for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}

}
