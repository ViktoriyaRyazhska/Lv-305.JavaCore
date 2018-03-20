package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskThree {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("C1=");
        int c1 = Integer.parseInt(bf.readLine());
        System.out.print("t1=");
        int t1 = Integer.parseInt(bf.readLine());
        System.out.print("C1=");
        int c2 = Integer.parseInt(bf.readLine());
        System.out.print("t1=");
        int t2 = Integer.parseInt(bf.readLine());
        System.out.print("C1=");
        int c3 = Integer.parseInt(bf.readLine());
        System.out.print("t1=");
        int t3 = Integer.parseInt(bf.readLine());
        System.out.println("C1 * T1 = " + c1 * t1);
        System.out.println("C2 * T2 = " + c2 * t2);
        System.out.println("C3 * T3 = " + c3 * t3);
        System.out.println("Sum = " + c1 * t1 + c2 * t2 + c3 * t3);
    }
}
