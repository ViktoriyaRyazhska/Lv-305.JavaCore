import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a method readNumber(int start, int end), that read from console integer number and return it,
 * if it is in the range [start...end].
 If an invalid number or non-number text is read, the method should throw an exception.
 Using this method write a method main(), that has to enter 10 numbers:
 a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

 */
public class NumberReader {
    public static void main(String[] args) throws IOException, NumberFormatException{
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


     readNumber(reader,1,13 );

    }

    public static void readNumber(BufferedReader reader, int start, int end)  {
            int number;
        try{
            for (int i = 0; i < 10; i++){
                System.out.print("Enter number: ");
                number = Integer.parseInt(reader.readLine());
                if (number >= start && number <= end ) {
                    System.out.println("Number " + number + " accept");
                }

            }
        } catch (IOException | NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }
}
