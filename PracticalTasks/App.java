/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson13;

import lesson13.tasks.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Task[] tasks = init();
        while (true) {
            System.out.println("\n===========\n");
            printMenu(tasks);
            try {
                int taskNumber = Integer.parseInt(bufferedReader.readLine());
                tasks[taskNumber - 1].execute(bufferedReader);
                bufferedReader.readLine();
                Runtime.getRuntime().exec("cls");
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
        tasks[0] = new Task1();
        tasks[2] = new Task3();
        tasks[3] = new Task4();
        tasks[6] = new Task7();
        tasks[7] = new Task8();
        tasks[9] = new Task10();

        tasks[11] = new Task12();
        tasks[12] = new Task13();
        return tasks;
    }
}
