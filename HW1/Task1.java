package HW1;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Please, enter argument A.");
        double arga = Double.parseDouble(br.readLine());
        System.out.println("Please, enter argument B.");
        double argb = Double.parseDouble(br.readLine());
        double sum = arga + argb;
        System.out.println("The result of addition is " + sum + ".");
        double sub = arga - argb;
        System.out.println("The result of subtraction is " + sub + ".");
        double mult = arga * argb;
        System.out.println("The result of multiplication is " + mult + ".");
        double div = arga / argb;
        System.out.println("The result of division is " + div + ".");
        System.out.println("Thanks for using MyCalc.");
    }
}