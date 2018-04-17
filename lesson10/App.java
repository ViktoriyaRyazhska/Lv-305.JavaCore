package lesson10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        //Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
        System.out.println("Task 1 \n");
        taskOne();

        //Output two messages «Hello, world»
        // and «Peace in the peace» 5 times each with the intervals of 2 seconds, and the second - 3 seconds.
        // After printing messages, print the text «My name is …»
        System.out.println("\nTask 2  \n");
        taskTwo();

        //Prepare mytext.txt file with a lot of text inside.
        //Read context from file into array of strings.
        //Each array item contains one line from file.
        //Complete next tasks:
        //   1) count and write the number of symbols in every line.
        //   2) find the longest and the shortest line.
        //   3) find and write only that lines, which consist of word «var»
        System.out.println("\nTask 3 \n");
        taskThree();
    }

    private static void taskOne() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    private static void taskTwo() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello, world»");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Peace in the peace");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("My name is Igor");
    }

    private static void taskThree() {
        String fileName = "file.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());
            String longestLine = lines.get(0);
            String shortestLine = lines.get(0);
            int i = 0;
            for (String line : lines) {
                if (longestLine.length() < line.length()) {
                    longestLine = line;
                }
                if (shortestLine.length() > line.length()) {
                    shortestLine = line;
                }
                System.out.println((i + 1) + ": " + line.length());
                if (line.contains("true")) {
                    System.out.println(line);
                }
                i++;
            }

            System.out.println("Longest line: " + longestLine);
            System.out.println("Shortest line: " + shortestLine);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
