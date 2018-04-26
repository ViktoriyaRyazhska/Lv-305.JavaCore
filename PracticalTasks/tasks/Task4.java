/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;
import java.io.IOException;

public class Task4 implements Task {
    private final String task = "Input string and check if this string is palindrome (e.g. “ABCCBA”)";

    @Override
    public void execute(BufferedReader bufferedReader) {
        System.out.println("\n=============\n" + task);
        System.out.println("Input your string: ");
        try {
            String str = bufferedReader.readLine();
            System.out.println();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    System.out.print(str.charAt(i));
                }
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
