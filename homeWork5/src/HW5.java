import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Homework 5. Task 1.");
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] month_Names = {"J", "F", "M", "A", "M", "June", "July", "A", "S", "O", "N", "D"};
        int leapFeb = 29;

        System.out.println("Input month number");
        int monthNumb = Integer.parseInt(sc.nextLine());
        //for non dev)
        int n = monthNumb - 1;
        if (n == 1) {
//            розібратися з введенням Y or N
//            String leapYear = String.parse(sc.nextLine());
            System.out.println("Leap (1) or none (2)");
            int leapYear = Integer.parseInt(sc.nextLine());
            if (leapYear == 1) {
                System.out.println(month_Names[n] + " has " + leapFeb);
            } else {
                System.out.println(month_Names[n] + " has " + month_days[n]);
            }
        } else {
            System.out.println(month_Names[n] + " has " + month_days[n]);
        }


//        System.out.println("MEMENTO MORI");


//2
//    System.out.print("Homework 5. Task 2.");
//    int[] temper = { -10, 20, -5, 17, -3, 5, -7, 11, 9, 13 };
//    int max = temper[0];
//    int imax = 0;
//    int i = 0;
//		while (i < temper.length) {
//        if (temper[i] > max) {
//            max = temper[i];
//            imax = i;
//        }
//        i++;
//    }
//		System.out.print("Maximum = " + max);
//		System.out.println(" is in " + (imax + 1) + " place");

        //3
        System.out.println();
        System.out.println("Homework 5. Task 3.");
        int[] ar3 = {-10, 20, -5, 17, -3, -255};
        int min = ar3[0];
        int imin = 0;
        int i = 0;
        //дописати position of second positive number;
        while (i < ar3.length) {
            if (ar3[i] < min) {
                min = ar3[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");



        //4
        System.out.println();
        System.out.println("Homework 5. Task 4.");
        Scanner sc4 = new Scanner(System.in);
//        int  sc4 = 1;
        int prod4 = 1;
        while () {
            System.out.println("Input number");
           int n4 = Integer.parseInt(sc.nextLine());
            if (n4 >= 0) {
                if (n4 % 2 == 0) {
                    prod4 *= n4;
                }
                 break;
            }
        }
        System.out.println(prod4);
        sc.close();

        }
}



