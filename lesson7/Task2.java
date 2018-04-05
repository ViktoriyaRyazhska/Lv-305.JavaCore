/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "Employee 1");
        employeeMap.put(2, "Employee 2");
        employeeMap.put(3, "Employee 3");
        employeeMap.put(4, "Employee 3");
        employeeMap.put(5, "Employee 3");
        employeeMap.put(6, "Employee 6");
        employeeMap.put(7, "Employee 7");
        System.out.println(employeeMap);
        System.out.println("Input id of the Employee: ");
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int id = Integer.parseInt(bufferedReader.readLine());
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("Error!");
        }
        System.out.println("Input name: ");
        String name = bufferedReader.readLine();
        if (employeeMap.containsValue(name)) {
            Iterator iterator = employeeMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
                if (entry.getValue().equals(name)) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }
}
