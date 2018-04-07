package lesson07_strings.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class FiveWordsSentence {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
        String sentence = reader.readLine();
        String[] words = sentence.split(" ");
        System.out.println(Arrays.stream(words).max(Comparator.comparingInt(String::length)).get());
    }
    catch (Exception e){
        e.printStackTrace();}
    }
}
