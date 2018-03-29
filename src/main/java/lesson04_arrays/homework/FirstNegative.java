package lesson04_arrays.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FirstNegative {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.matches("\\d+")) list.add(Integer.parseInt(s));
            else {
                System.out.println("product of all entered even numbers: " + list.stream().filter(x -> x % 2 == 0).reduce(1, (x, y) -> x * y));
                break;
            }

        }
    }
}
