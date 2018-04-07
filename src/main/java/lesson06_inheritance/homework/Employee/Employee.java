package lesson06_inheritance.homework.Employee;

import java.util.*;

public abstract class Employee implements CalculateAble{
   protected String employeeId;
   protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

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
