package task2;

public class Task2 {

	public final static Object obj1 = new Object();
	public final static Object obj2 = new Object();
	public static void main(String[] args) {

		Thread thr1 = new Thread() {

			public void run() {
				synchronized (obj1) {
					Thread.yield();
					synchronized (obj2) {
						System.out.println("success1");
					}
				}
			}
		};
		Thread thr2 = new Thread() {

			public void run() {
				synchronized (obj2) {
					Thread.yield();
					synchronized (obj1) {
						System.out.println("success2");
					}
				}
			}
		};
		thr1.start();
		thr2.start();
		System.out.println("end");
		 

	}

}
