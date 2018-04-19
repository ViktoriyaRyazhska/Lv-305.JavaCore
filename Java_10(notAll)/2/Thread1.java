/*Create a thread «one», which would start the thread «two»,
        which has to output its number («Thread number two») 3 times
        and create thread «three», which would to output message
        «Thread number three» 5 times.*/


package com.company;

public class Thread1 extends Thread {
    @Override
    public void run() {
        Thread2 t = new Thread2();
        t.start();

    }
}


