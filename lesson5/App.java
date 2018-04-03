package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        taskOne(bufferedReader);
        taskTwo(bufferedReader);
    }

    private static void taskOne(BufferedReader bufferedReader) throws IOException {
        int[] array = new int[10];
        System.out.println("Input your array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int max = array[0];
        int min = array[0];
        int sum = 0;
        int negativeAmount = 0;

        for (int element : array) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
            if (element >= 0) {
                sum += element;
            } else {
                negativeAmount++;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Maximum element: " + max);
        System.out.println("Maximum element: " + min);
        System.out.println("Sum of positive elements: " + sum);
        System.out.println("Amount of negative elements: " + negativeAmount);
        System.out.println("There are more " + (array.length - negativeAmount > negativeAmount ? "positive" : "negative")
                + " elements.");
    }

    private static void taskTwo(BufferedReader bufferedReader) throws IOException {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Employee1", 1, 42);
        employees[1] = new Employee("Employee2", 1, 50);
        employees[2] = new Employee("Employee3", 2, 85);
        employees[3] = new Employee("Employee4", 2, 17);
        employees[4] = new Employee("Employee5", 3, 6);
        System.out.println("Array of employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Please input number of department from witch which to want to  get employees: ");
        int departmentNumber = Integer.parseInt(bufferedReader.readLine());
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
            }
        }
        sortEmployees(employees);
        System.out.println("Sorted array:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void sortEmployees(Employee[] employees) {

    }
}
