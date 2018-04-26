package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;

public class Task12 implements Task {

	private final String task = "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9." +
			" The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.";

	@Override
	public void execute(BufferedReader bufferedReader) {
		System.out.println("\n=============\n" + task);
		int sum = 0;
		for (int i = 1; i < 1001; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += 1;
			}
		}
		System.out.println("Sum: " + sum);
	}

	@Override
	public String getTask() {
		return task;
	}
}
