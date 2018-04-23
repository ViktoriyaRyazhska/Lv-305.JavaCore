package edu.homework_inheritace.Task2_Employee;

public class SalariedEmployee extends Employee implements Calculate {
    private int socialSecurityNumber;
    private int hourlyRate;
    private int workedHours;

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public SalariedEmployee(String employeeId, String type, int socialSecurityNumber, int hourlyRate, int workedHours) {
        super(employeeId, type);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public int calculatePay() {
        return getHourlyRate() * getWorkedHours();
    }

    @Override
    public String toString() {
        return "Employee ID" + getEmployeeId() + " " + getType() + " Earns per month " + calculatePay() ;
    }
}