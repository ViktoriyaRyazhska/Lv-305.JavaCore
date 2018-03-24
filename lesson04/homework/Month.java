package lesson04.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Month {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        List<Integer> list = Arrays.asList(31, 28,31,30,31,30,31,31,30,31); - bad practice to use asList()
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        System.out.println(list.get(Integer.parseInt(reader.readLine()) - 1));
    }
}
