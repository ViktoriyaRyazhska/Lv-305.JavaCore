package SoftServeHW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Define String variables name and address.
// Output question "What is your name?" Read the value name and output next question: “Where are you live, (name)?".
// Read address and write whole information.
public class Task2 {
    private static BufferedReader reader = null;

    public static void main(String[] args) {
        START();
    }

    static void START() {
        setReader();
        System.out.println(questions(1));
        String name = getAnswer();
        System.out.println(questions(2) + name + " ? ");
        String country = getAnswer();
        System.out.println(" Ur name : " + name + ", u living in : " + country);

    }

    static String questions(int numberOfQuestion) {
        switch (numberOfQuestion) {
            case 1:
                return "What is your name?";
            case 2:
                return "Where are you live ";
        }
        return "";
    }

    static String getAnswer() {
        String answer = "";
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

    static void setReader() {
        if (reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
    }


}
