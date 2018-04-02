package com.company;

                            //   Enter 5 integer numbers. Find
                            //• position of second positive number;
                            //• minimum and its position in the array
                            // ---------------------------------------------------------------------------.

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Arr_All {
    public static void main(String[] args) {
        int arr[] = {12, -3, -4, 5, 6};
        int position = 0;
        int min = arr[0];
        int min_position = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                position++;
                if (position == 2) {

                    System.out.println("Position of second positive number:" + i);
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min_position = i;
            }
        }
        System.out.println("Min number is : " + min + " and position : " + min_position);


                    /* Enter 10 integer numbers. Calculate
                  the sum of first 5 elements if they are
                 positive or product of last 5 element in the other case.
     -----------------------------------------------------------------------------------------------*/




        int[] integer = {1, 2, -3, 1, 3, 3, 4, 5, 7, -2};
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (integer[i] > 0) {
                sum += integer[i];
            }

        }
        System.out.println("Sum of first 5 element :" + sum);

        for (int c = 5; c < 10; c++) {
            System.out.println("Last 5 element:  " + integer[c]);
        }



/*                   Ask user to enter the number of month.
                   Read the value and write the amount
                       of days in this month
                     (create array with amount days of each month)
              ----------------------------------------------------------.*/
        int[] month;
        month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the month :");
        int input = sc.nextInt();
        String[] name = new DateFormatSymbols().getMonths();
        System.out.println("The days in month  : " + month[input - 1] + " " + name[input - 1]);



            ///**/Organize entering integers until the first negative number.
                // Count the  product of all entered even numbers.
//        -------------------------------------------------------------/**/




        int product =1;
        Scanner scc = new Scanner(System.in);
        System.out.println("Input number : ");

        for (int i =0 ; i >=0 ; i++) {
            int input1 = scc.nextInt();
            if (input1 < 0) {
                break;
            }
            if (input1 % 2 == 0) {
                product *=input1;
            }

        }
        System.out.println("Count : " + product );

    }


}

