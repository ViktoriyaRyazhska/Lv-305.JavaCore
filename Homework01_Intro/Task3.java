import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static double coastCalc (double coin, double time) {
        double coast = coin * time;
        return coast;
    }

    public static double sum(double res1, double res2, double res3) {
        double result = res1 + res2 + res3;
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter price for phone call in country 1");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("Enter duration of phone call in minutes");
        int t1 = Integer.parseInt(br.readLine());
        double t1Dub = (double) t1;

        double result1 = coastCalc(c1, t1Dub);
        System.out.println("Call coast " + result1 + " standard units");

        System.out.println("Enter price for phone call in country 2");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("Enter duration of phone call in minutes");
        int t2 = Integer.parseInt(br.readLine());
        double t2Dub = (double) t2;

        double result2 = coastCalc(c2, t2Dub);
        System.out.println("Call coast " + result2 + " standard units");

        System.out.println("Enter price for phone call in country 3");
        double c3 = Double.parseDouble(br.readLine());
        System.out.println("Enter duration of phone call in minutes");
        int t3 = Integer.parseInt(br.readLine());
        double t3Dub = (double) t3;

        double result3 = coastCalc(c3, t3Dub);
        System.out.println("Call coast " + result3 + " standard units");

        double sumTalk = sum(result1, result2, result3);
        System.out.println("All talks coast " + sumTalk + " standard units");


    }
}
