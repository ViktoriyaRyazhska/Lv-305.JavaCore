package lesson09_IO_Thread;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAbout {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Lv-305.JavaCore\\src\\main\\java\\lesson09_IO_Thread\\file1.txt"));
            ArrayList<String> list = new ArrayList<>();
            while (reader.ready()){
                list.add(reader.readLine());
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Lv-305.JavaCore\\src\\main\\java\\lesson09_IO_Thread\\file2.txt"));
            writer.write("lines in text :"+list.size());
            writer.write(". Longest line: "+list.stream().max(Comparator.comparingInt(String::length)).get());
            String name="";
            String birthday="";
            Pattern nameP = Pattern.compile("name is [\\w]+");
            Pattern birthP = Pattern.compile("[\\d]{2}.[\\d]{2}.[\\d]{2,}");

            for(String s : list){
                Matcher nameM = nameP.matcher(s);
                Matcher birthM = birthP.matcher(s);
                while (nameM.find()) {name=s.substring(nameM.start(), nameM.end());}
                while (birthM.find()){ birthday=s.substring(birthM.start(), birthM.end());}
            }

            writer.write(" Name : "+name);
            writer.write(" Birthday : "+birthday);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
