package com.company;

public class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread two");
            Thread3 t3 = new Thread3();
            t3.start();

        }
    }

}
