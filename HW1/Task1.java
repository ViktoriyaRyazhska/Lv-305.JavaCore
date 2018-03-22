package SoftServeHW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Flower bed is shaped like a circle.
// Calculate the perimeter and area by entering the radius.
// Output obtained results.
public class Task1 {
    private static BufferedReader reader = null;

    public static void main(String[] args) {
        START();
    }

    static void START() {
        setReader();
        int radius = getRadius();
        double Area = calculateArea(radius);
        double Perimeter = calculatePerimeter(radius);
        System.out.println("Area is : " + Area);
        System.out.println("Perimeter is : " + Perimeter);
    }

    static int getRadius() {

        int num = 0;
        try {
            num = Integer.parseInt(reader.readLine());
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

    static double calculateArea(int radius) { //S = 3.14 * (r*r)
        return Math.PI * (radius * radius);
    }

    static double calculatePerimeter(int radius) {//L = (2*3.14) * r
        return (2 * Math.PI) * radius;
    }


}
