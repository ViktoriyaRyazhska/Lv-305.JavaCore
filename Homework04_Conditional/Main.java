package edu.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("tuzik", Breed.BEAGLE, 3);
        Dog dog2 = new Dog("ralf", Breed.HUSKY, 4);
        Dog dog3 = new Dog("tuzik", Breed.SHEPHERD, 5);


        Set<String> newDogSet = new HashSet<String>();
            newDogSet.add(dog1.getName());
            newDogSet.add(dog2.getName());
            newDogSet.add(dog3.getName());
        System.out.println(newDogSet);



    }
}
