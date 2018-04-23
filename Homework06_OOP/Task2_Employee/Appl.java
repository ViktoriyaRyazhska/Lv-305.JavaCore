package edu.homework_inheritace.Task2_Employee;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new ContractEmployee("j001", "John", 1234, 2200);
        employees[1] = new SalariedEmployee("j002", "Tony", 4321, 25, 45);
        employees[2] = new ContractEmployee("j003", "Zed", 112233, 900);
        employees[3] = new SalariedEmployee("j004", "Igora", 332211, 25, 75);
        Employee tmp;

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (((Calculate) employees[i]).calculatePay() < ((Calculate) employees[j]).calculatePay()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        for (Employee emp : employees) {
            System.out.println(emp);
        }


    }
}