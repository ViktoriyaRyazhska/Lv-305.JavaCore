package task2;

import java.util.*;

public class StartClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>(Arrays.asList(new SalariedEmployee("1","Tom","345",230.5),
                new ContractEmployee("2","Ivan","784", 15.5, 21)));
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.calculatePay() - o1.calculatePay());
            }
        });
        employees.forEach(x-> System.out.printf("ID: [%s], Name :[%s], Wage: [%.2f]\n",x.getEmployeeId(),x.getName(),x.calculatePay()));
    }
}
