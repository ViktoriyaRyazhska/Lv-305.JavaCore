package CW10;

public class task3 {

	public static void main(String[] args) {
		Thread three = new Thread() {
			public void run()
			{
				for(int i =0;i<5;++i)
				{
					System.out.println("Thread number three");
				}
			}
		};
		Thread two = new Thread() {
			public void run()
			{
				for(int i=0;i<3;++i)
				{
					System.out.println("Thread number two");
				}
				three.start();
				
			}
		};
		Thread one = new Thread() {
			public void run()
			{
				two.start();
			}
		};
		one.start();
		

	}

}
