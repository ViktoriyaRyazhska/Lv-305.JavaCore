package edu.homework_inheritace.Task2_Employee;

public class Employee {
    private String employeeId;
    private String type;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Employee(String employeeId, String type) {
        this.employeeId = employeeId;
        this.type = type;
    }
}
