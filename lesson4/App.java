/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Task 1:");
        task1(bufferedReader);
        System.out.println("Task 2:");
        task2(bufferedReader);
        System.out.println("Task 3:");
        task3(bufferedReader);
        System.out.println("Task 4:");
        task4(bufferedReader);
    }

    private static void task1(BufferedReader bufferedReader) throws IOException {
        int[] arr = new int[5];
        int odd = 0;
        System.out.println("Please input " + arr.length + " items (1 per line)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Odd numbers count: " + odd);
    }

    public static void task2(BufferedReader bufferedReader) throws IOException {
        System.out.println("Input number of a day: ");
        int numberOfADay = Integer.parseInt(bufferedReader.readLine());
        String dayName;
        switch (numberOfADay) {
            case 1:
                System.out.println(Day.MONDAY);
                break;
            case 2:
                System.out.println(Day.TUESDAY);
                break;
            case 3:
                System.out.println(Day.WEDNESDAY);
                break;
            case 4:
                System.out.println(Day.THURSDAY);
                break;
            case 5:
                System.out.println(Day.FRIDAY);
                break;
            case 6:
                System.out.println(Day.SATURDAY);
                break;
            case 7:
                System.out.println(Day.SUNDAY);
                break;
            default:
                System.out.println("Wrong!");
                break;
        }
    }

    private static void task3(BufferedReader bufferedReader) throws IOException {
        String country = bufferedReader.readLine();
        System.out.println("Please input country name:");
        switch (country.toLowerCase()) {
            case "україна":
            case "німеччина":
            case "велика британія":
            case "польща":
                System.out.println(Continent.Europe);
                break;
            case "китай":
            case "індія":
                System.out.println(Continent.Asia);
                break;
            case "сша":
            case "мексика":
            case "канада":
                System.out.println(Continent.NorthAmerica);
                break;
            case "бразилія":
            case "чилі":
                System.out.println(Continent.SouthAmerica);
                break;
            case "нігерія":
            case "египет":
            case "пар":
                System.out.println(Continent.Africa);
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

    private static void task4(BufferedReader bufferedReader) throws IOException {
        Product[] products = new Product[4];
        Product mostExpensive;
        Product biggestQuantity;
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product #" + (i + 1) + " name: ");
            String name = bufferedReader.readLine();
            System.out.println("Product #" + (i + 1) + " price: ");
            int price = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Product #" + (i + 1) + " quantity: ");
            int quantity = Integer.parseInt(bufferedReader.readLine());
            products[i] = new Product(name, price, quantity);
        }

        biggestQuantity = products[0];
        mostExpensive = products[0];
        for (Product product : products) {
            if (product.greaterNumberOf(biggestQuantity)) {
                biggestQuantity = product;
            }
            if (product.moreExpensiveThan(mostExpensive)) {
                mostExpensive = product;
            }
        }
        System.out.println("Most expensive product:\n" + mostExpensive);
        System.out.println("Product with biggest quantity:\n" + biggestQuantity);
    }
}

