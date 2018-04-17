import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

//Create class Car with fields type, year of production and engine capacity.
// Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.
public class Appl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1990, 1.2));
        cars.add(new Car("Mazda", 2000, 1.3));
        cars.add(new Car("KIA", 2008, 1.8));
        cars.add(new Car("Seat", 2010, 1.4));

        System.out.print("Enter model year. We'll display model if we've it in store: ");
        int inputYear = Integer.parseInt(br.readLine());
        for (Car car : cars) {
            if (car.getYear() == inputYear) {
                System.out.println(car);
            }
        }

        System.out.println("Cars sorted by the year");
        cars.sort(Comparator.comparing(Car::getYear));
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }
}
