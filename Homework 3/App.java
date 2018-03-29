/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson4.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


enum HttpError {
    BadRequest("Bad Request"), Unauthorized("Unauthorized"), PaymentRequired("Payment Required"), Forbidden("Forbidden"),
    NotFound("Not Found"), MethodNotAllowed("Method Not Allowed"), NotAcceptable("Not Acceptable"),
    RequestTimeout("Request Timeout"), ProxyAuthenticationRequired("Proxy Authentication Required");

    String error;

    HttpError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        try {
            taskOneA(bufferedReader, n);
            taskOneB(bufferedReader, n);
            taskOneC(bufferedReader);
        } catch (IOException e) {
            System.out.println("Error reading data from input stream");
        }
        taskTwo();
    }


    private static void taskOneA(BufferedReader bufferedReader, int numberOfElements) throws IOException {

        System.out.println("Write " + numberOfElements + " float numbers");
        for (int i = 0; i < numberOfElements; i++) {
            float floatNumber = Float.parseFloat(bufferedReader.readLine());
            System.out.println(floatNumber >= -5 && floatNumber <= 5 ? floatNumber + " is in range [-5; 5]" :
                    floatNumber + " is not in range [-5; 5]");
        }
    }


    private static void taskOneB(BufferedReader bufferedReader, int numberOfElements) throws IOException {
        List<Integer> ints = new LinkedList<>();
        System.out.println("Write " + numberOfElements + " integer numbers");
        for (int i = 0; i < numberOfElements; i++) {
            ints.add(Integer.parseInt(bufferedReader.readLine()));
        }
        System.out.println("Maximum element is: " + Collections.max(ints));
        System.out.println("Minimum element is: " + Collections.min(ints));
    }

    private static void taskOneC(BufferedReader bufferedReader) throws IOException {
        int errorNumber = Integer.parseInt(bufferedReader.readLine());
        switch (errorNumber) {
            case 400:
                System.out.println(HttpError.BadRequest);
                break;
            case 401:
                System.out.println(HttpError.Unauthorized);
                break;
            case 402:
                System.out.println(HttpError.PaymentRequired);
                break;
            case 403:
                System.out.println(HttpError.Forbidden);
                break;
            case 404:
                System.out.println(HttpError.NotFound);
                break;
            case 405:
                System.out.println(HttpError.MethodNotAllowed);
                break;
            case 406:
                System.out.println(HttpError.NotAcceptable);
                break;
            case 407:
                System.out.println(HttpError.ProxyAuthenticationRequired);
                break;
            case 408:
                System.out.println(HttpError.RequestTimeout);
                break;
            default:
                System.out.println("Unknown");
        }
    }

    private static void taskTwo() {
        List<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog("Bob", Breed.HUSKY, 5));
        dogs.add(new Dog("Rex", Breed.SHEPHERD, 7));
        dogs.add(new Dog("Mark", Breed.POODLE, 2));

        //Display the name and the kind of the oldest dog
        Dog oldestDog = dogs.get(0);
        for (Dog dog : dogs) {
            if (dog.isOlder(oldestDog)) {
                oldestDog = dog;
            }
        }
        System.out.println("Oldest do is: " + oldestDog);

        //Check if there is no two dogs with the same name
        if (twoDogsOneName(dogs)) {
            System.out.println("There are two dogs with one name");
        } else {
            System.out.println("All dogs have unique name");
        }
    }

    private static boolean twoDogsOneName(List<Dog> dogs) {
        List<String> dogNames = new LinkedList<>();
        for (Dog dog : dogs) {
            if (!dogNames.contains(dog.getName())) {
                dogNames.add(dog.getName());
            } else {
                return true;
            }
        }
        return false;
    }
}
