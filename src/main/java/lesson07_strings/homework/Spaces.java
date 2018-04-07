package lesson07_strings.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Spaces {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String s = reader.readLine();
            System.out.println(s.replaceAll(" {2,}"," "));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
