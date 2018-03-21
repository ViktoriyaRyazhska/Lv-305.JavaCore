package HW1;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter all abonement's countries");
        String ac1 = sc.nextLine();
        String ac2 = sc.nextLine();
        String ac3 = sc.nextLine();
        System.out.println("Countries are " + ", " + ac1 +", " + ac2 +", " + ac3);
                BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Please, enter call rate ($US per minute) for " + ac1);
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("Please, enter call duration (minutes) for " + ac1);
        double t1 = Double.parseDouble(br.readLine());
        System.out.println("Cost of call to " + ac1 + " is " + c1 * t1 + " $US.");
        System.out.println("Please, enter call rate ($US per minute) for " + ac2);
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("Please, enter call duration (minutes) for " + ac2);
        double t2 = Double.parseDouble(br.readLine());
        System.out.println("Cost of call to " + ac2 + " is " + c2 * t2 + " $US.");
        System.out.println("Please, enter call rate ($US per minute) for " + ac3);
        double c3 = Double.parseDouble(br.readLine());
        System.out.println("Please, enter call duration (minutes) for " + ac3);
        double t3 = Double.parseDouble(br.readLine());
        System.out.println("Cost of call to " + ac3 + " is " + c3 * t3+ " $US.");
        System.out.println("Cost of all your calls is " + (c1 * t1 + c2 * t2 + c3 * t3) + "$US.");

        System.out.println("Thanks for using CallCalc.");
    }
}