/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task7 implements Task {
    private final String task = "Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)";

    @Override
    public void execute(BufferedReader bufferedReader) {
        System.out.println("\n=============\n" + task);
        System.out.println("Please input n: ");
        try {
            long n = Long.parseLong(bufferedReader.readLine());
            if (n > 0) {
                long factorial = 1;
                for (long i = 2; i <= n; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + n + " is " + factorial);
            } else {
                System.out.println("n must be > 0");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    @Override
    public String getTask() {
        return task;
    }
}
