package edu.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Number2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> elements = new LinkedList<>();
        int i = 3;
        while (i > 0) {
            System.out.println("Put numbers in list");
            elements.add(Integer.parseInt(br.readLine()));
            i--;
        }
        System.out.println("Max is: " + Collections.max(elements));
        System.out.println("Min is: " + Collections.min(elements));
    }
}
