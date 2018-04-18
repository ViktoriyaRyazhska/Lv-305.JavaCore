package lesson09_IO_Thread;

public class InnerThreads {
    public static void main(String[] args) {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread two = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Thread number two");
                        }
                        Thread three = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("Thread number three");
                                }
                            }
                        });
                        three.start();
                    }
                });
                two.start();
            }
        });
        one.start();
    }
}
