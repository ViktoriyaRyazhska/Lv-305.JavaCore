/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task10 implements Task {
    private final String task = "Find the number of steps for which you get 1, using the following process: we take any\n" +
            "the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then\n" +
            "multiply by 3 and add 1";

    @Override
    public void execute(BufferedReader bufferedReader) {
        System.out.println("\n=============\n" + task);
        System.out.println("Input natural number n:");
        try {
            int n = Integer.parseInt(bufferedReader.readLine());
            int steps = 0;
            if (n > 0) {
                while (n != 1) {
                    steps++;
                    if (n % 2 == 0) {
                        n /= 2;
                    } else {
                        n *= 3 + 1;
                    }
                }
                System.out.println("Steps: " + steps);
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
