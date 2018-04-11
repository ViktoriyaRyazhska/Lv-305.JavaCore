package HW5.task5;

import HW5.GetValues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(4);
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        System.out.println(" Enter year of a car that u wanna find : ");
        int yearOfCar = GetValues.getInteger();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getYear()==yearOfCar){
                System.out.println(cars.get(i).toString());
            }
        }
        cars.sort(Comparator.comparing(Car::getYear));

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getYear());

        }

    }
}
