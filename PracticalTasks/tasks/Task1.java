package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 implements Task {

    private final String task = "Input number and generate Fibonacci sequence (e.g. number: 6, result: 1, 1, 2, 3, 5, 8)";

    @Override
    public void execute(BufferedReader bufferedReader) {
        System.out.println("\n=============\n" + task);
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print("Input number and generate Fibonacci : ");
        try {
            int count = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Your Fibonacci series is: ");
            for (int i = 0; i < count; i++) {
                n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;
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