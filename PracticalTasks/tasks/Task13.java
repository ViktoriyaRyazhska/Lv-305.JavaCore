
package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;

public class Task12 implements Task {
    private final String task = "\tThe smallest positive number that is evenly divisible by all of the numbers from 1 to 20";

    @Override
    public void execute(BufferedReader bufferedReader) {
    	private int i = 2520;
    	
    	while (  i %  2 != 0 || i %  3 != 0 || i %  4 != 0 || i %  5 != 0 ||
    		         i %  6 != 0 || i %  7 != 0 || i %  8 != 0 || i %  9 != 0 ||
    		         i % 10 != 0 || i % 11 != 0 || i % 12 != 0 || i % 13 != 0 ||
    		         i % 14 != 0 || i % 15 != 0 || i % 16 != 0 || i % 17 != 0 ||
    		         i % 18 != 0 || i % 19 != 0 || i % 20 != 0) {
    		    i += 20;
    		}
    	System.out.println(i);
    }

    @Override
    public String getTask() {
        return task;
    }
}

