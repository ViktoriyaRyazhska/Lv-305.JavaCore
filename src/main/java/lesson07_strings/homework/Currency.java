package lesson07_strings.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String sentence = reader.readLine();
            String pattern = "\\$(\\d+)(\\.(\\d{2}))?"; // how to
            Pattern p = Pattern.compile(pattern);
            Matcher matcher = p.matcher(sentence);
            while (matcher.find()){
                System.out.println(sentence.substring(matcher.start(), matcher.end()));
            }


        }
        catch (Exception e){
            e.printStackTrace();}
    }
}

