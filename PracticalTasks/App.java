/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson13;

import lesson13.tasks.Task7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Task[] tasks = init();
        while (true) {
            printMenu(tasks);
            try {
                int taskNumber = Integer.parseInt(bufferedReader.readLine());
                tasks[taskNumber + 1].execute(bufferedReader);
            } catch (Exception e) {
                System.out.println("Error. Please try again.");
            }
        }


    }

    private static void printMenu(Task[] tasks) {
        System.out.println("Please select task number");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println((i + 1) + ") " + ((tasks[i] != null) ? tasks[i].getTask() : "empty"));
        }
    }

    private static Task[] init() {
        Task[] tasks = new Task[14];

        tasks[6] = new Task7();

        return tasks;
    }
}
