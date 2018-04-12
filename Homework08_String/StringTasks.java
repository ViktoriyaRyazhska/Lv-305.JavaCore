import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTasks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Task 1\n");
        task1(reader);

        System.out.println("Task 2\n");
        task2(reader);

        System.out.println("TAsk 3\n");
        task3(reader);
    }
    //Enter in the console sentence of five words.
    //display the longest word in the sentence
    //determine the number of its letters
    //bring the second word in reverse order
    public static void task1(BufferedReader reader) throws IOException{
        System.out.println("Enter words ");

        String[] str = reader.readLine().split(" ");

        String highest = Collections.max(Arrays.asList(str));
        System.out.println("longest word is: " + highest+ " \nnumber of it's letters is:  " + highest.length());
        System.out.println("reversed second word is: " + new StringBuilder(str[1]).reverse().toString());

    }

    //Enter a sentence that contains the words between more than one space.
    // Convert all spaces, consecutive, one.
    // For example, if we introduce the sentence
    // "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
    public static void task2(BufferedReader reader) throws IOException{
        System.out.println("Enter sentence");

        String str = reader.readLine();
        String after = str.trim().replaceAll(" +", " ");
        System.out.println(after);
    }
    //Implement a pattern for US currency: the first symbol "$",
    // then any number of digits, dot and two digits after the dot.
    // Enter the text from the console that contains several occurrences of US currency.
    // Display all occurrences on the screen.
    public static void task3(BufferedReader reader) throws IOException {
        System.out.println("Enter the text");

        String str = reader.readLine();

        String pattern = "\\$(\\d+)(\\.(\\d{2}))?";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(str);
        while (matcher.find()){
            System.out.println("All occurrences are: " + str.substring(matcher.start(), matcher.end()));
        }
    }
}
