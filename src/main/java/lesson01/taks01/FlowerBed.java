package lesson01.taks01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {

    private double radius;

    public FlowerBed(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    public double getArea() {
        return Math.pow(getRadius() * Math.PI, 2);
    }

    public void printPerimeter() {
        System.out.println("The raduis of your Flower Bed is: " + String.format("%.3f", getPerimeter()).replace(',', '.'));
    }

    public void printArea() {
        System.out.println("The raduis of your Flower Bed is: " + String.format("%.3f", getArea()).replace(',', '.'));
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine().replace(",", ".");
            if (s.matches("\\d+\\.\\d+") || s.matches("\\d+")) {
                FlowerBed flowerBed = new FlowerBed(Double.parseDouble(s));
                flowerBed.printPerimeter();
                flowerBed.printArea();
            } else System.out.println("Wrong type of radius.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
