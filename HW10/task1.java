package HW10;

import java.io.IOException;

public class task1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Thread t1 =new Thread() {
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("I'm first thread");
				}
			}
		};
		Thread t2 =new Thread() {
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("I'm second thread");
				}
			}
		};
		Thread t3 =new Thread() {
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("I'm third thread");
				}
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
	}

}
