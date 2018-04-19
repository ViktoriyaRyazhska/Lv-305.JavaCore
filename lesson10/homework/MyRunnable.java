package lesson10.homework;

public class MyRunnable implements Runnable {

    private String message;

    public MyRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}
