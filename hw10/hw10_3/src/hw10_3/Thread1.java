package hw10_3;

public class Thread1 extends Thread {

	@Override
	public void run() {
		Thread2 next = new Thread2();
		next.start();
	}
}

class Thread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ")" + " Thraed #2");
		}
		Thread3 next = new Thread3();
		next.start();
		System.out.println("============");
	}
}

class Thread3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ")" + " Thraed #3");
		}
	}
}