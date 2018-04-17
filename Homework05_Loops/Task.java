import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Task 1\n");
        task1(reader);

        System.out.println("Task 2\n");
        task2(reader);

        System.out.println("Task 3\n");
        task3(reader);

        System.out.println("Task 4\n");
        task4(reader);

    }

    public static int read(BufferedReader reader) {
        try {
            int a = Integer.parseInt(reader.readLine());
            return a;
        } catch (IOException e) {
            return -1;
        }
    }

    //Task 1
    //Ask user to enter the number of month.
    // Read the value and write the amount of days in this month
    // (create array with amount days of each month).
    public static void task1(BufferedReader reader) {
        int[] arr = {28, 30, 31};
        System.out.println("Enter number of month");
        int monthNumber = read(reader);
        if (monthNumber > 0 && monthNumber < 13) {
            switch (monthNumber) {
                case 1:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("This month has"+ arr[2]);
                    break;
                case 2:
                    System.out.println("This month has"+ arr[0]);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("This month has"+ arr[1]);
            }
        } else {
            System.out.println("wrong");
        }
    }

    //Task 2
    //Enter 10 integer numbers.
    // Calculate the sum of first 5 elements
    // if they are positive or product of last 5 element in the other case.
    public static void task2(BufferedReader reader) {
        int[] numbers = new int[10];
        int negativeCounter = 0;
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter #" + (i + 1) + " of array: ");
            numbers[i] = read(reader);
            }

        for (int j = 0; j < 5; j++) {
            if(numbers[j] < 0){
                negativeCounter++;
            };
        }

        if (negativeCounter == 0){
            for (int k = 0; k < 5; k++) {
                sum += numbers[k];
            }
            System.out.println("Result is: " + sum);
        } else {
            for (int h = 5; h < numbers.length; h++){
                product *= numbers[h];
            }
            System.out.println("Result is: " + product );
        }
        System.out.println(negativeCounter);
    }

    //Task 3
    //Enter 5 integer numbers. Find
    //position of second positive number;
    //minimum and its position in the array.
    public static void task3(BufferedReader reader){
        int [] listOfFive = new int[5];
        int positiveCounter = 0;
        int positionPositive = 0;
        for (int i = 0; i < listOfFive.length; i++) {
            System.out.print("Enter #" + (i + 1) + " in  array: ");
            listOfFive[i] = read(reader);
            if (listOfFive[i] > 0){
                positiveCounter++;
                if (positiveCounter == 2){
                    positionPositive = i;
                }
            }
        }
        int min = listOfFive[0];
        int positionMin = 0;
        int j = 0;
        while(j < listOfFive.length){
            if (listOfFive[j] < min){
                min = listOfFive[j];
                positionMin = j;
            }
            j++;
        }
        System.out.println("Position of second positive is: #" + (positionPositive+1) );
        System.out.println("Minimum number in array is: " + min + " on position #" + (positionMin +1));
    }

    //Organize entering integers until the first negative number.
    // Count the product of all entered even numbers.
    public static void task4(BufferedReader reader){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i == 0){
            System.out.print("Enter element: ");
            list.add(read(reader));
            if (list.get(j) < 0){
                i++;
            }
            j++;
        }
        int product = 1;
        for (int k = 0; k < list.size(); k++){
            if (list.get(k) % 2 != 0){
                product *= list.get(k);
            }
        }
        System.out.println("Result is: " + product);
    }
}




