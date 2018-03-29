/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson4.homework;

import java.util.LinkedList;
import java.util.List;

enum Breed {
    HUSKY("Husky"), BEAGLE("Beagle"), POODLE("Poodle"), SHEPHERD("Shepherd"), BULLDOG("Bulldog"),  LABRADOR("Labrador");

    private String breedName;

    Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }
}

public class Dog {

    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public boolean isOlder(Dog dog) {
        return this.age > dog.getAge();
    }

    public static boolean dogsHaveUniqueNames(List<Dog> dogs) {
        List<String> dogNames = new LinkedList<>();
        for (Dog dog : dogs) {
            if (!dogNames.contains(dog.getName())) {
                dogNames.add(dog.getName());
            } else {
                return false;
            }
        }
        return true;
    }
}
