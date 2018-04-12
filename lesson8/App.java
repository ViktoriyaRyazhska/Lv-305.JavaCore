package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Enter the two variables of type String. Determine whether the first variable substring second.
        // For example, if you typed «IT» and «IT Academy» you must receive true.
        System.out.println("TASK 1\n");
        taskOne();

        //Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
        //  surnames and initials
        //  name
        //  name, middle name and last name
        System.out.println("\nTASK 2\n");
        taskTwo(bufferedReader);

        //The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
        // Using regular expressions implement checking the user name for validity.
        // Input five names in the main method . Output a message to the console of the validation of each of the entered names.
        System.out.println("\nTASK 3\n");
        taskThree();

    }

    private static void taskOne() {
        String it = "IT";
        String itAcademy = "IT Academy";
        System.out.println(itAcademy.contains(it));
        if (itAcademy.contains(it)) {
            System.out.println(itAcademy + " contains " + it);
        } else {
            System.out.println(itAcademy + " doesn`t contain " + it);
        }
    }

    private static void taskTwo(BufferedReader bufferedReader) {
        System.out.println("Please input surname, name and patronymic: ");
        try {
            String[] strings = bufferedReader.readLine().split(" ");
            if (strings.length == 3) {
                String surname = strings[0];
                String name = strings[1];
                String patronymic = strings[2];
                System.out.println("Surnames and initials: " + surname + " " + name.charAt(0) + ". "
                        + patronymic.charAt(0) + ".");
                System.out.println("Name: " + name);
                System.out.println("Name, middle name and last name: " + name + " " + patronymic + " " + surname);
            } else {
                System.out.println("Error reading data");
            }
        } catch (IOException e) {
            System.out.println("Error reading stream");
        }
    }

    private static void taskThree() {
        List<String> names = new LinkedList<>();
        names.add("qw");
        names.add("Qwerty");
        names.add("Qwertyuikjbvcdxcvbnmjhgfdfghj");
        names.add("Qqwew456456");
        names.add("hhhs_sadsad");

        Pattern pattern = Pattern.compile("[a-zA-Z]{3,15}");
        Matcher matcher;
        for (String name : names) {
            matcher = pattern.matcher(name);
            if (matcher.matches()) {
                System.out.println(name + " matches pattern");
            } else {
                System.out.println(name + " doesn`t matches pattern");
            }
        }
    }
}
