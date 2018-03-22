package lesson03.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;


public class Task {
    BufferedReader instance;

    public BufferedReader getInstance() {
        if(instance==null){
            instance=new BufferedReader(new InputStreamReader(System.in));
        }
        return instance;
    }
    void taskA() throws IOException{
        BufferedReader reader = getInstance();
        String s = reader.readLine();
        if(s.matches("\\d+\\.\\d+")){
            float f = Float.parseFloat(s);
                if(f>=-5.0&&f<=5.0) System.out.println("In range");
                else System.out.println("Not in range");
        }
        else System.out.println("Not a float");
    }
    void taskB() throws IOException{
        BufferedReader reader = getInstance();
        String s=reader.readLine(), d=reader.readLine(),f=reader.readLine();
        if(s.matches("[-]?\\d+")&&d.matches("[-]?\\d+")&&f.matches("[-]?\\d+")){

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.parseInt(s));
            arrayList.add(Integer.parseInt(f));
            arrayList.add(Integer.parseInt(d));

            int max = arrayList.stream().max(Comparator.naturalOrder()).get();
            int min = arrayList.stream().min(Integer::compareTo).get();

            System.out.println("max int: " + max);
            System.out.println("min int: " + min);
        }
        else System.out.println("wrong numbers");

    }
    void taskHttp()throws IOException {
        BufferedReader reader = getInstance();
        String s = reader.readLine();
        if (s.matches("\\d+")) {
            int i = Integer.parseInt(s);
            System.out.println();//todo
        }
    }
    public static void main(String[]args){
        Task task = new Task();
        try {
           task.taskA();
           task.taskA();
           task.taskA();
            task.taskB();
            task.taskHttp();
        } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

