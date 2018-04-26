package lesson13.tasks;

import lesson13.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Task3 implements Task {

    private final String task = "Input cost of dollar and sum of money in gryvna. Calculate how many dollars user can buy and change.";

    @Override
    public void execute(BufferedReader bufferedReader) {
        System.out.println("\n=============\n" + task);
        try {
            System.out.println("Input USD rate");
            double usdRate = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Input UAH Sum");
            double uhySum = Double.parseDouble(bufferedReader.readLine());
            int usdSum = (int) (uhySum / usdRate);
            System.out.print("You can buy " + usdSum + " USD");
            double uhyChange = uhySum - (usdSum * usdRate);
            System.out.print(" and change is " + uhyChange + " UAH");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    @Override
    public String getTask() {
        return task;
    }
}
