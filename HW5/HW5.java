package HW5;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Homewor 5. Task 1.");
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] month_Names = {"J", "F", "M", "A", "M", "June", "July", "A", "S", "O", "N", "D"};
        int leapFeb = 29;

        System.out.println("Input month number");
        int monthNumb = Integer.parseInt(sc.nextLine());
        //for human, not developers
        int n = monthNumb - 1;
        if (n == 1) {
//            System.out.println("Leap (1) or none (2)");
//            розібратися з введенням Y or N
//            String leapYear = String.parse(sc.nextLine());
            System.out.println("Leap (1) or none (2)");
            int leapYear = Integer.parseInt(sc.nextLine());
            if (leapYear == 1) {
                System.out.println(month_Names[n] + " has " + leapFeb);
            } else {
                System.out.println(month_Names[n] + " has " + month_days[n]);
            }
        }
          else{
                System.out.println(month_Names[n] + " has " + month_days[n]);
            }

            sc.close();
        System.out.println("MEMENTO MORI");


        // 2
        System.out.println("Homewor 5. Task 2.");
        int[] temper = { -10, 20, -5, 17, -3, 5, -7, 11, 9, 13 };
        int sum1 = 0;
        int prod1 = 0;
        int i = 0;
        while (i < temper.length) {
            if (temper[i] > max) {
                max = temper[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0){
                n = i;
                continue;
            }
            sum += n;
        }
        System.out.println(sum);
        sc.close();





    }
    }

