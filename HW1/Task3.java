package SoftServeHW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Phone calls from three different countries are с1, с2 and с3 standard units per minute.
// Talks continued t1, t2 and t3 minutes.
// How much computer will count for each call separately and all talk together?
// Input all source data from console, make calculations and output to the screen.
public class Task3 {
    private static BufferedReader reader = null;
    private static double price1 = 0.0;
    private static double price2 = 0.0;
    private static double price3 = 0.0;

    private static double talk1 = 0.0;
    private static double talk2 = 0.0;
    private static double talk3 = 0.0;


    public static void main(String[] args) {
        START();
    }

    static void START() {
        setReader();
        System.out.println("Hey! Enter price for 3 different countries .");
        price1 = getDouble();
        price2 = getDouble();
        price3 = getDouble();
        System.out.println("Excellent! Now enter duration for 3 different talks .");
        talk1 = getDouble();
        talk2 = getDouble();
        talk3 = getDouble();
        calculate();

    }

    static void calculate() {
        System.out.println("First talk cost: " + price1 * talk1);
        System.out.println("Second talk cost: " + price2 * talk2);
        System.out.println("Third talk cost: " + price3 * talk3);

    }

    static double getDouble() {

        double num = 0;
        try {
            num = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return num;
    }

    static void setReader() {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
    }

}
