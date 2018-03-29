package lesson08_exceptions.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleNumbers {
    double div(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        DoubleNumbers dn = new DoubleNumbers();
        try {
            System.out.println("input two doubles");
            double a = Double.parseDouble(r.readLine());
            double b = Double.parseDouble(r.readLine());
            double result = dn.div(a,b);
        }
        catch (ArithmeticException | IOException e){
            e.printStackTrace();
        }

    }
}
