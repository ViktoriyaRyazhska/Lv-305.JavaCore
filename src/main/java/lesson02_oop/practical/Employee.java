package lesson02_oop.practical;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;

    String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     double getRate() {
        return rate;
    }

     void setRate(double rate) {
        this.rate = rate;
    }

     double getHours() {
        return hours;
    }

     void setHours(double hours) {
        this.hours = hours;
    }

     static double getTotalSum() {
        return totalSum;
    }

     private static void setTotalSum(double totalSum) {
        Employee.totalSum += totalSum;
    }
    
    public Employee(){
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
     
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        setTotalSum(salary());
    }
     double salary(){
        return getRate()*getHours();
    }

    @Override
    public String toString() {
        return String.format("Name : %s. Rate : %s. Hours : %s.", getName(),String.format("%.2f",getRate()),String.format("%.2f",getHours()));
    }
     void changeRate(double rate){
        setRate(rate);
    }
     double bonuses(){
        return 0.1*salary();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Mike",10.5,8);
        Employee employee2 = new Employee("John",15,9);
        Employee employee3 = new Employee("Mark",22.2,8.5);
        System.out.println(employee1+"\n"+employee2+"\n"+employee3);
        System.out.println("Total sallary: " + String.format("%.2f",Employee.getTotalSum()));
    }
}

