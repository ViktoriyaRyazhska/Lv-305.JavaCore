package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("R = ");
        double r = Double.parseDouble(bf.readLine());
        double p = Math.pow(r, 2) * Math.PI;
        System.out.println("\nP = " + p);
    }
}
