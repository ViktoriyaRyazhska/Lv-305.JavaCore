import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static double resultArea(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
    public static double resultPerimeter(double r) {
        double perimeter = 2 * Math.PI * r;
        return perimeter;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter radius value");
        double radius = Double.parseDouble(br.readLine());


        double rezArea = resultArea(radius);
        double rezPerimeter = resultPerimeter(radius);

        System.out.println("Circle area = " + rezArea);
        System.out.println("Circle perimeter = " + rezPerimeter);


    }

}
