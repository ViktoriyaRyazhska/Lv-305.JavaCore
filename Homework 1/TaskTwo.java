package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = bf.readLine();
        System.out.println("Where are you live, " + name);
        String address = bf.readLine();
        System.out.println("Your name is " + name + " and you live here: " + address);
    }
}
