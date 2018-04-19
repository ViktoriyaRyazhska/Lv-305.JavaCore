/*
Run three threads and output there different messages for 5
        times. The third thread supposed to start after finishing working
        of the two previous threads.
        2. Cause a deadlock. Organize the expectations of ending a thread
        in main(), and make the end of the method main() in this
        thread.
*/




package com.company;

public class Main extends Thread {
    private String message;

    public Main(String message) {
        this.message = message;
    }


    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread  " + message);

        }

    }

    public static void main(String[] args) {
        Main t1 = new Main("hello");
        Main t2 = new Main("hello2");
        Main t3 = new Main("hello3");

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    t3.start();
    }



}
