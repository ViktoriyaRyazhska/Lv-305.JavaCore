package lesson02_oop.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    private static BufferedReader reader = null;
    private String name;
    private int birthYear;

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

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    int age(int currentYear) {
        return currentYear - getBirthYear();
    }

    void input() {
        BufferedReader reader = getInstance();
        try {
            System.out.println("Input the name  :");
            String s = reader.readLine();
            if (s.matches("[a-zA-Z]+")) {
                setName(s);
                System.out.println("Input year of a birth :");
                String y = reader.readLine();
                if (y.matches("\\d+")) {
                    setBirthYear(Integer.parseInt(y));
                } else System.out.println("Wrong data(year).");
            } else System.out.println("Wrong data(name).");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void output() {
        System.out.println("Person name : " + getName() + " .Person age : " + age(2018));
    }

    void changeName(String name) {
        setName(name);
    }

    private BufferedReader getInstance() {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
        return reader;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        person1.input();
        person1.output();
        person2.input();
        person2.output();
        person3.input();
        person3.output();
        person4.input();
        person4.output();
        person5.input();
        person5.output();

    }

}
