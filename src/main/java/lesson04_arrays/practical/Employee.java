package lesson04_arrays.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int depNum;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepNum() {
        return depNum;
    }

    public void setDepNum(int depNum) {
        this.depNum = depNum;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int depNum, double salary) {
        this.name = name;

        this.depNum = depNum;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("name : \"%s\" , department : %d , salary: %.2f ",getName(),getDepNum(),getSalary());
    }
    void printEmp(){
        System.out.println(this);
    }

    public static void main(String[] args) throws IOException {
        List<Employee> l = new ArrayList();
        l.add(new Employee("first",1,20.5));
        l.add(new Employee("second",2,21.5));
        l.add(new Employee("third",3,22.5));
        l.add(new Employee("fourth",4,23.5));
        l.add(new Employee("fifth",5,24.5));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        l.stream().filter(employee -> employee.getDepNum()==n).forEach(Employee::printEmp);

        List<Employee> sortedlist = l.stream().sorted(Comparator.comparingDouble(Employee::getDepNum)).collect(Collectors.toList());
        sortedlist.forEach(Employee::printEmp);

    }


}
