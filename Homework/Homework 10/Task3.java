//Create a thread «one», which would start the thread «two», 
//which has to output its number («Thread number two») 3 times and create thread «three»,
//which would to output message «Thread number three» 5 times.

public class Task3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            	System.out.println("This is thread number 1");
                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("This is thread number 2");
                        }
                        Thread t3 = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("This is thread number 3");
                                }
                            }
                        });
                        t3.start();
                    }
                });
                t2.start();
            }
        });
        t1.start();	}

}
