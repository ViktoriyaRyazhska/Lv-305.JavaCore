//3. Внесіть схему для валюти США: перший символ "$",
//        тоді будь-яка кількість цифр, крапка та дві цифри після крапки.
//        Введіть текст з консолі, що містить кілька
//        входження валюти США. Показати всі події на
//        екран. * /*/
//


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency  ");
        String input = sc.nextLine();

        Pattern p = Pattern.compile((" \\$\\d+\\.\\d{2} "));
        Matcher m = p.matcher(input);
        try {
            while (m.find()) {
                System.out.println(input.substring(m.start(), m.end()) + "");

            }

        } catch (StringIndexOutOfBoundsException e ){
            e.printStackTrace();

        }
    }
}