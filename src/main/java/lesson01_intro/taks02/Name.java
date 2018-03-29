package lesson01_intro.taks02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {

    public static void main(String[] args) {
        String name;
        String adress;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("What is your name?");
            name = reader.readLine();
            System.out.println("Where do you live, " + name);
            adress = reader.readLine();
            System.out.println("Your name is " + name + ". You live in " + adress + " .");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
