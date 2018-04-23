package edu.homework_inheritace.Task2_Employee;

public class ContractEmployee extends Employee implements Calculate {
    private int federalTaxIdmember;
    private int monthlyPayment;

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public ContractEmployee(String employeeId, String type, int federalTaxIdmember, int monthlyPayment) {
        super(employeeId, type);
        this.federalTaxIdmember = federalTaxIdmember;
        this.monthlyPayment = monthlyPayment;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public int calculatePay() {
        return getMonthlyPayment();
    }

    @Override
    public String toString() {
        return "Employee ID" + getEmployeeId() + " " + getType() + " Earns per month " + calculatePay() ;
    }
}