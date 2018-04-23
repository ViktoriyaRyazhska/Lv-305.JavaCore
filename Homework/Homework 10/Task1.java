//Run three threads and output there different messages for 5 times. 
//The third thread supposed to start after finishing working of the two previous threads.

public class Task1 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("I'm Overlord");
					
				}
			}
		});

		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("NO! I'm Overlord!");
					
				}
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("I'm OVEROOVERLORD");
					
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.start();
			thread3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
