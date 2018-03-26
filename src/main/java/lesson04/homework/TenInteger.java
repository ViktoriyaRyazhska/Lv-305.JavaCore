package lesson04.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TenInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int c = 0;
        for (int i = 0; i < 5; i++) {
            if (list.get(i) >= 0) {
                c += list.get(i);
                if (i == 4) System.out.println("First 5 numbers are positive. Sum :" + c);
            } else {
                c = 1;
                for (int x = 5; x < 10; x++) {
                    c *= list.get(x);
                    if (x == 9) {
                        System.out.println("Product of last 5 numbers is: " + c);
                    }
                }
                break;
            }
        }
    }

}
