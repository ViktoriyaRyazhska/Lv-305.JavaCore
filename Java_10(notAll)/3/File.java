/*Create file1.txt file with a text about your career.
        Read context from file into array of strings. Each array item
        contains one line from file.
        Write in to the file2.txt
        1) number of lines in file1.txt.
        2) the longest line in file1.txt.
        3) your name and birthday date.*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class File {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader sc = new BufferedReader(new FileReader("taras.txt"))) {
            String temp;
            while ((temp = sc.readLine()) != null) {
                list.add(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException r) {
            r.printStackTrace();
        }
        try (BufferedWriter br = new BufferedWriter(new FileWriter("taras2.txt"))) {
            br.write("Number of line in taras.txt     =    " + list.size());
            br.newLine();

            br.write("The longes line is : " + list.stream().max(String::compareToIgnoreCase).get());
           br.newLine();
            br.write("Taras date birthday 04.16.1985");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
