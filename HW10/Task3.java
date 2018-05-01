package task3;

public class Task3 {

	public static void main(String[] args) {
		Thread two = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread number two");
				}
			}
		});

		Thread one = new Thread(new Runnable() {

			@Override
			public void run() {
				two.start();

			}
		});
		Thread three = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("thread number three");
				}

			}
		});
		
		one.start();
		three.start();
	}

}
