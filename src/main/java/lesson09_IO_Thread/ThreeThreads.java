package lesson09_IO_Thread;

public class ThreeThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<5; i++){
                    System.out.println("Thread 1");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<5; i++){
                    System.out.println("Thread 2");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<5; i++){
                    System.out.println("Thread 3");
                }
            }
        });
        try {
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            thread3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
