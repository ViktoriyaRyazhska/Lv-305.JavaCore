package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetValues {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int getInteger() {
        int currentInt = 0;
        System.out.println("Hi! Enter the integer number! ");
        while (true) {
            try {
                currentInt = Integer.parseInt(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Error.Enter Integer! ");
                continue;
            }
        }
        return currentInt;
    }

    public static int getNumberOfMonth() {
        int currentInt = 0;
        System.out.println("Hi! Enter the number of month! ");
        while (true) {
            try {
                currentInt = Integer.parseInt(reader.readLine());
                if (currentInt > 0 && currentInt < 13) {
                    break;
                }else{
                    System.out.println("U should enter number between 1 and 12");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Error.Enter Integer! ");
                continue;
            }
        }
        return currentInt;
    }

    public static String getString(){
        String s = "";
        System.out.println("Hi! Enter the String! ");

        try {
            s = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static double getDouble() {
        double currentInt = 0;
        System.out.println("Hi! Enter the double number! ");
        while (true) {
            try {
                currentInt = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Error.Enter double! ");
                continue;
            }
        }
        return currentInt;
    }
}
