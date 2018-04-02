package com.company;

import java.util.Scanner;
/*Create class Car with fields type, year of production and engine
        capacity. Create and initialize four instances of class Car. Display cars
        • certain model year (enter year in the console);ввести рік машини і вивести марку і параметри
        • ordered by the field year. урорядкувати за роком*/

public class Car {
    private String type;
    private int year;
    private double engine;

    public Car() {
    }

    public Car(String type, int year, double engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Car[] car = {
                new Car("opel", 2016, 1.8),
                new Car("peugeot", 2010, 1.1),
                new Car("kia", 2014, 1.2),
                new Car("mersedes", 2013, 1.6)};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year of car : ");
        int input = sc.nextInt();
        for (int i = 0; i < car.length; i++) {
            if (car[i].getYear() == input) {
                System.out.println(car[i]);

            }

        }

        Car sort;
        for (int i = 0; i < car.length - 1; i++) {

            for (int j = i + 1; j < car.length; j++) {
                if (car[i].getYear() < car[j].getYear()) {
                    sort = car[i];
                    car[i] = car[j];
                    car[j] = sort;


                }
            }

        }
        System.out.println("Order cars : ");
        for (int i = 0; i < car.length; i++) {


            System.out.println(car[i]);
        }
    }

}




