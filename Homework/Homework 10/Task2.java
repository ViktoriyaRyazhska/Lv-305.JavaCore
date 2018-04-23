//Cause a deadlock. Organize the expectations of ending a thread in main(), 
//and make the end of the method main() in this thread.

public class Task2 {
	public static int count = 0;
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (first) {
					Thread.yield();
					synchronized (second) {
						for (int i = 0; i < 100000; i++) {
							count++;
						}
					}
				}
			}

		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (second) {
					Thread.yield();
					synchronized (first) {
						for (int i = 0; i < 100000; i++) {
							count++;
						}
					}
				}

			}

		});

		thread1.run();
		thread2.run();
		System.out.println(count);
	}

}
