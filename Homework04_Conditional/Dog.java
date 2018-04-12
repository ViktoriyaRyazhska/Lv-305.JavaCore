package edu.homework;

public class Dog {
    private String name;
    private Breed breed;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }




}

enum Breed{
    HUSKY, BEAGLE, SHEPHERD;
}