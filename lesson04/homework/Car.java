package lesson04.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    private String type;
    private int yearOfProd;
    private int engCap;

    Car(String type, int yearOfProd, int engCap) {
        this.type = type;
        this.yearOfProd = yearOfProd;
        this.engCap = engCap;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    @Override
    public String toString() {
        return String.format("[car type: %s, year : %d, engine : %d]", this.type, this.yearOfProd, this.engCap);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("a", 2005, 500));
        list.add(new Car("b", 2004, 600));
        list.add(new Car("c", 2010, 700));
        list.add(new Car("d", 2007, 800));
        String s = reader.readLine();
        for (Car car : list) {
            if (car.type.equals(s)) System.out.println(car);
        }
        System.out.println(list.stream().sorted(Comparator.comparingInt(Car::getYearOfProd)).collect(Collectors.toList()));
    }
}
