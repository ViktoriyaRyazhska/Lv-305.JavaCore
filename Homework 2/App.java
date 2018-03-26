package lesson2.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        try {
            Person person1 = new Person("Іван", 1980);
            Person person2 = new Person("Марія", 1986);
            Person person3 = new Person("Дмитро", 1990);
            Person person4 = new Person("Мар\'яна", 1993);
            Person person5 = new Person();
            System.out.print("Person 5 input: ");
            person5.input();
            System.out.print("Person 5 output: ");
            person5.output();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Person 5 new name: ");
            String name = bufferedReader.readLine();
            person5.changeName(name);
            System.out.print("Person 1: ");
            person1.output();
            System.out.println("Age: " + person1.age());
            System.out.print("Person 2: ");
            person2.output();
            System.out.println("Age: " + person2.age());
            System.out.print("Person 3: ");
            person3.output();
            System.out.println("Age: " + person3.age());
            System.out.print("Person 4: ");
            person4.output();
            System.out.println("Age: " + person4.age());
            System.out.print("Person 5: ");
            person5.output();
            System.out.println("Age: " + person5.age());
        } catch (IOException e) {
            System.out.println("Error reading data from input stream");
        }
    }
}
