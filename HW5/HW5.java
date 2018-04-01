package HW5;

import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] month_Names = {"J", "F", "M", "A", "M", "June", "July", "A", "S", "O", "N", "D"};
        int leapFeb = 29;

        System.out.println("Input month number");
        int monthNumb = Integer.parseInt(sc.nextLine());
        //for non dev)
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

        }
    }

