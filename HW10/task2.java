package HW10;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
		Thread main_thread =new Thread().currentThread();
		Thread t1 = new Thread() {
			public void run() {
				try {
					main_thread.join();
					System.out.println("Thread 1");
				} catch (InterruptedException e) {
					
				}
			}

		};
		try {
		t1.start();
		
		t1.join();
		System.out.println("Main thread");

	}
		catch(InterruptedException e)
		{
			
		}
	}
}
