package HW4.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Oleksandr Bezborodov
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

    public static float getFloat() {
        double temp = 0.0;
        float currentFloat = 0.0F;

        System.out.println("Hi! Enter the float number! ");

        //Користувач вводить число double.
        //Якщо це число входить в діапазон float - присвоюємо це число в змінну float currentFloat
        while (true) {
            try {
                temp = Double.parseDouble(reader.readLine());

                if (temp >= Integer.MIN_VALUE && temp <= Integer.MAX_VALUE) {
                    currentFloat = (float) temp;
                    break;
                } else {
                    System.out.print("Error! Enter number between : " + Float.MIN_VALUE + "/" + Float.MAX_VALUE);

                }
            } catch (Exception e) {
                System.out.print("Error! Enter number between : " + Float.MIN_VALUE + "/" + Float.MAX_VALUE);

            }
        }
        return currentFloat;
    }


}
