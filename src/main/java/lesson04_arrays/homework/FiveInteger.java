package lesson04_arrays.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FiveInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0) count++;
            if (count == 1) {
                System.out.println("position of second positive number is : " + i);
                break;
            }
        }
        int min = Integer.MAX_VALUE;
        int pos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                pos = i;
            }
        }
        System.out.println("position of minimum number is : " + pos);
    }
}
