package edu.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++ ){
            System.out.println("The [-5,5] range checker. Please enter numbers: ");
            range(Float.parseFloat(br.readLine()));
        }
    }

    public static void range (float x) {
        if (x >= -5 && x <= 5) {
            System.out.println(x + " belong to [-5,5]");
        } else {
            System.out.println("wrong number");
        }
    }
}
