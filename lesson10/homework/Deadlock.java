package lesson10.homework;

public class Deadlock {
    private final static Object first = new Object();
    private final static Object second = new Object();

    public static void main(String s[]) {

        //Cause a deadlock. Organize the expectations of ending a thread in main(),
        // and make the end of the method main() in this thread.
        System.out.println("Deadlock demo");
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success!");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    Thread.yield();
                    synchronized (first) {
                        System.out.println("Success!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}