package task1;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("First Thread");
				}

			}

		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Second Thread");
				}

			}

		});
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Third Thread");
				}

			}

		});
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread3.start();
	}

}
