import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create method div(), which calculates the dividing of two double numbers.
 * In main method input 2 double numbers and call this method.
 * Catch all exceptions.
 */
public class DoubleDividing {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter \"a\" (from a/b) number: ");
            Double a = Double.parseDouble(reader.readLine());

            System.out.print("\nEnter \"b\" number: ");
            Double b = Double.parseDouble(reader.readLine());


            System.out.printf("\nResult of a/b = " + div(a, b));
        }
        catch ( ArithmeticException | IOException e) {
            e.printStackTrace();
        }

    }

    public static double div(double a, double b){
        return a/b;

    }
}
