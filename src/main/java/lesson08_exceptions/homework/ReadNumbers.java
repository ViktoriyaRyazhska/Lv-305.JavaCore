package lesson08_exceptions.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumbers {
    static void readNumber(BufferedReader r, int start, int end)throws IOException, NumberFormatException {
        int a = Integer.parseInt(r.readLine());
        if(a>=start||a<=end) System.out.println(a);
    }
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            readNumber(bufferedReader,5,15);
        } catch (IOException|NumberFormatException e) {
            System.out.println("caught");
        }
    }
}
