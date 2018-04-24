/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        character = br.readLine();
        String tempWord = testWord;
        for (int i = 0; i < testWord.length(); i++) {
            String ch = tempWord.substring(0, 1);
            tempWord = tempWord.substring(1, tempWord.length());
            if (ch.equals(character)) {
                countCharacters++;
            }
        }
        System.out.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);

    }
}
