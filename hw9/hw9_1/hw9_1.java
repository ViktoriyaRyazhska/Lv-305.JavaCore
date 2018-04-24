import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw9_1 {
    public static void main (String [] args){
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("Enter two double numbers");

        try {
            double a = Double.parseDouble(br.readLine());
            double b = Double.parseDouble(br.readLine());

            System.out.println( div(a,b));
        } catch ( ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Invalid number format!");
        }
    }
    public static double div (double a, double b) throws ArithmeticException{
        if (b != 0) {
            System.out.print("Rezult: ");
            return a/b;
        }else {
            throw new ArithmeticException("You can not divide by zero");
        }
    }
}
