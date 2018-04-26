

package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;

public class Task12 implements Task {
    private final String task = "\tFind the sum of all the multiples of 3 or 5 below 1000";

    @Override
    public void execute(BufferedReader bufferedReader) {
    	private int sum = 0;
    		for (int i = 1; i < 1001; i++) {
    			if ((i % 3 == 0) || (i % 5 == 0)) {
    				sum += 1;
    			}
    		System.out.println(sum);
    }

    @Override
    public String getTask() {
        return task;
    }
}
