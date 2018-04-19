package lesson10.homework;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        //Run three threads and output there different messages for 5 times.
        // The third thread supposed to start after finishing working of the two previous threads.
        System.out.println("Task 1 \n");
        taskOne();

        //Create a thread «one», which would start the thread «two», which has to output its number
        // («Thread number two») 3 times and create thread «three», which would to output message
        // «Thread number three» 5 times.
        System.out.println("Task 3 \n");
        taskThree();

        //Create file1.txt file with a text about your career.
        //Read context from file into array of strings. Each array item contains one line from file.
        //Write in to the file2.txt
        //   1) number of lines in file1.txt.
        //   2) the longest line in file1.txt.
        //   3) your name and birthday date.
        System.out.println("\nTask 4 \n");
        taskFour();
    }

    private static void taskOne() {
        Thread t1 = new Thread(new MyRunnable("Message from 1-st Thread"));
        Thread t2 = new Thread(new MyRunnable("Message from 2-nd Thread"));
        Thread t3 = new Thread(new MyRunnable("Message from 3-rd Thread"));
        System.out.println("Starting threads");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            t3.start();
            System.out.println("Finish");
            t3.join(); //waiting for thread 3 to continue with next task without not necessary output from it
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    private static void taskThree() {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread two = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Thread number two");
                        }
                        Thread three = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("Thread number three");
                                }
                            }
                        });
                        three.start();
                    }
                });
                two.start();
            }
        });
        one.start();
    }

    private static void taskFour(){
        String file1Name = "file1.txt";
        String file2Name = "file2.txt";
        List<String> lines;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1Name));
            lines = bufferedReader.lines().collect(Collectors.toList());
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
            return;
        }
        String longestLine = lines.get(0);
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2Name));
            bufferedWriter.write("Number of lines: " + lines.size());
            bufferedWriter.newLine();
            bufferedWriter.write("Longest line: " + longestLine);
            bufferedWriter.newLine();
            bufferedWriter.write("My name is: Igor and I was born 7-th of September 1996");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
        }

    }
}
