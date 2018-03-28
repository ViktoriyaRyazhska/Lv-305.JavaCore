package lesson03_con_stat.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddNum {

    private void oddCalculate(int... values) {
        int odd = 0;
        for (int i : values) {
            if (i % 2 == 1) odd++;
        }
        System.out.println(odd + " number(s) is/are odd");
    }

    private int inputInteger(BufferedReader reader) {
        int i = 0;
        try {
            System.out.println("Enter a number:");
            String s = reader.readLine();
            if (!s.matches("\\d+")) {
                System.out.println("Invalid data");
            }
            i = Integer.parseInt(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OddNum on = new OddNum();
        on.oddCalculate(on.inputInteger(br), on.inputInteger(br), on.inputInteger(br));
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
