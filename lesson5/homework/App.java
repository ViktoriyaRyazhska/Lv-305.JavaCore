package lesson5.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            //Ask user to enter the number of month.
            //Read the value and write the amount of days in this month
            //  (create array with amount days of each month).
            taskOne(bufferedReader);

            //Enter 10 integer numbers.
            //  Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
            taskTwo(bufferedReader);

            //Enter 5 integer numbers. Find
            //  position of second positive number;
            //  minimum and its position in the array.
            taskThree(bufferedReader);

            //Organize entering integers until the first negative number. Count the product of all entered even numbers.
            taskFour(bufferedReader);

            //Create class Car with fields type, year of production and engine capacity.
            //Create and initialize four instances of class Car. Display cars
            //  certain model year  (enter year in the console);
            //  ordered by the field year.
            taskFive(bufferedReader);
        } catch (IOException e) {
            System.out.println("Can`t read input stream");
        }
    }

    private static void taskOne(BufferedReader bufferedReader) throws IOException {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Task 1");
        System.out.println("Input number of month to get number of days in it");
        try {
            int numberOfMonth = Integer.parseInt(bufferedReader.readLine());
            if (numberOfMonth >= 1 && numberOfMonth <= 12) {
                System.out.println(numberOfMonth + " month has " + numberOfDays[numberOfMonth - 1] + " days");
            } else {
                System.out.println("Number of month must be in range from 1 to 12");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error reading month number");
        }
    }

    private static void taskTwo(BufferedReader bufferedReader) throws IOException {
        System.out.println("Task 2");
        int[] array = new int[10];
        boolean firstFiveNegative = false;
        System.out.println("Enter " + array.length + " integer numbers");
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(bufferedReader.readLine());
                if (array[i] < 0 && i < 5) {
                    firstFiveNegative = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error reading number. Please try again");
                i--;
            }
        }
        if (!firstFiveNegative) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += array[i];
            }
            System.out.println("All of first 5 elements are positive. Product of last 5 = " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < array.length; i++) {
                product *= array[i];
            }
            System.out.println("One of first 5 elements is negative. Product of last 5 = " + product);
        }
    }

    private static void taskThree(BufferedReader bufferedReader) throws IOException {
        int[] array = new int[5];
        System.out.println("Task 3");
        System.out.println("Input " + array.length + " integer numbers");
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error reading number. Please try again");
                i--;
            }
        }
        int secondPositivePosition = -1;
        int minPosition = 0;
        boolean isFirst = true;
        boolean isSecond = true;
        for (int i = 0; i < array.length; i++) {
            //Second positive position
            if (array[i] >= 0 && isFirst) {
                isFirst = false;
            } else if (array[i] >= 0 && !isFirst && isSecond) {
                secondPositivePosition = i;
                isSecond = false;
            }
            //Finding minimum element
            if (array[i] < array[minPosition]) {
                minPosition = i;
            }
        }
        System.out.println("Array: \n" + Arrays.toString(array));
        System.out.println("Second positive element is " + (secondPositivePosition > 0 ? array[secondPositivePosition]
                + "[" + secondPositivePosition + "]" : "null"));
        System.out.println("Minimum element is " + array[minPosition] + "[" + minPosition + "]");
    }

    private static void taskFour(BufferedReader bufferedReader) throws IOException {
        System.out.println("Task 4");
        System.out.println("Input your numbers: ");
        int product = 1;
        int count = 0;
        while (true) {
            try {
                int number = Integer.parseInt(bufferedReader.readLine());
                if (number < 0) {
                    break;
                } else if (count % 2 == 0) {
                    product *= number;
                }
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Error reading number. Please try again");
            }
        }
        System.out.println("Product of all numbers = " + product);
    }

    private static void taskFive(BufferedReader bufferedReader) throws IOException {
        System.out.println("Task 5");
        System.out.println("Please input information about cars: ");
        Car[] cars = new Car[4];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Year of production:");
            int year = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Car type:");
            String type = bufferedReader.readLine();
            System.out.println("Engine capacity:");
            double engineCapacity = Double.parseDouble(bufferedReader.readLine());
            cars[i] = new Car(type, year, engineCapacity);
        }
        System.out.println("Array of Cars: \n" + Arrays.toString(cars));
        Car.sortArray(cars);
        System.out.println("Sorted array of Cars: \n" + Arrays.toString(cars));
    }
}
