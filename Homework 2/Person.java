package lesson2.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String name;
    private int birthYear;

    public Person() { }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "name: '" + name + ", birthYear: " + birthYear;
    }

    public int age() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void changeName(String name) {
        setName(name);
    }

    public void input() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name: ");
        this.name = bufferedReader.readLine();
        System.out.print("Birth year: ");
        this.birthYear = Integer.parseInt(bufferedReader.readLine());
    }

    public void output() {
        System.out.println(this);
    }
}
