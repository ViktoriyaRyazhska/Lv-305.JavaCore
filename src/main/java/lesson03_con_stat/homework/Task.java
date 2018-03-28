package lesson03_con_stat.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Task {
    BufferedReader instance;

    public BufferedReader getInstance() {
        if (instance == null) {
            instance = new BufferedReader(new InputStreamReader(System.in));
        }
        return instance;
    }

    void taskA() throws IOException {
        BufferedReader reader = getInstance();
        String s = reader.readLine();
        if (s.matches("\\d+\\.\\d+")) {
            float f = Float.parseFloat(s);
            if (f >= -5.0 && f <= 5.0) System.out.println("In range");
            else System.out.println("Not in range");
        } else System.out.println("Not a float");
    }

    void taskB() throws IOException {
        BufferedReader reader = getInstance();
        String s = reader.readLine(), d = reader.readLine(), f = reader.readLine();
        if (s.matches("[-]?\\d+") && d.matches("[-]?\\d+") && f.matches("[-]?\\d+")) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.parseInt(s));
            arrayList.add(Integer.parseInt(f));
            arrayList.add(Integer.parseInt(d));

            int max = arrayList.stream().max(Comparator.naturalOrder()).get();
            int min = arrayList.stream().min(Integer::compareTo).get();

            System.out.println("max int: " + max);
            System.out.println("min int: " + min);
        } else System.out.println("wrong numbers");

    }

    void taskHttp() throws IOException {
        BufferedReader reader = getInstance();
        String s = reader.readLine();
        if (s.matches("[4]\\d\\d")) {
            int i = Integer.parseInt(s);
            for(HTTPError eror : HTTPError.erors){
                if(i==eror.getCode()){
                    System.out.println(eror.name().substring(0,1)+eror.name().substring(1).toLowerCase().replace("_"," "));
                }
            }
        }
        else System.out.println("wrong error code");
    }

    public static void main(String[] args) {
        Task task = new Task();
        try {
            System.out.println("3 float numbers: ");
            task.taskA();
            task.taskA();
            task.taskA();
            System.out.println("3 integers: ");
            task.taskB();
            System.out.println("http code");
            task.taskHttp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

enum HTTPError {
    BAD_REQUEST(400), UNAUTHORIZED(401), NOT_FOUND(404), REQUEST_TIMEOUT(408);
    int i;

    HTTPError(int i) {
        this.i=i;
    }

    public int getCode() {
        return i;
    }
    static List<HTTPError> erors = Arrays.asList(HTTPError.values());
}
