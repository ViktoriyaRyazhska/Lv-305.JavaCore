package lesson8.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //Enter in the console sentence of five words.
        //  display the longest word in the sentence
        //  determine the number of its letters
        //  bring the second word in reverse order
        System.out.println("TASK 1\n");
        taskOne(bufferedReader);

        //Enter a sentence that contains the words between more than one space.
        //Convert all spaces, consecutive, one.
        //For example, if we introduce the sentence "I    am      learning     Java   Core»,
        //we have to get the "I'm learning Java Core»
        System.out.println("\nTASK 2\n");
        taskTwo();

        //Implement a pattern for US currency:
        //the first symbol "$", then any number of digits, dot and two digits after the dot.
        //Enter the text from the console that contains several occurrences of US currency.
        //Display all occurrences on the screen.
        System.out.println("\nTASK 3\n");
        taskThree(bufferedReader);
    }

    private static void taskOne(BufferedReader bufferedReader) {
        System.out.println("Please enter sentence of five words: ");
        try {
            String[] words = bufferedReader.readLine().split(" ");
            String longestWord = words[0];
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Longest word: " + longestWord);
            System.out.println("Longest word size: " + longestWord.length());
            if (words.length >= 2) {
                System.out.println("Second word: " + words[2]);
                System.out.println("Second word (reverse): " + new StringBuilder(words[2]).reverse().toString());
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static void taskTwo() {
        String input = "I    am      learning     Java   Core";
        Pattern pattern = Pattern.compile("\\s{2,}");
        Matcher matcher = pattern.matcher(input);
        String output = matcher.replaceAll(" ");
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    private static void taskThree(BufferedReader bufferedReader) {
        System.out.println("Please input some string that contains some currency:");
        try {
            String str = bufferedReader.readLine();
            //some $25 text with $25.23 different dollars
            //$25
            //$25.23
            Pattern pattern = Pattern.compile("\\$\\d+(\\.\\d{2})?");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(str.substring(matcher.start(), matcher.end()));
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
