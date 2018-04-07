package lesson06_inheritance.homework.Employee;

public class ContractEmployee extends Employee {
   private String federalTaxIdmember;
   private double hoursWorked;
   private double hourlyRate;


    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return getHourlyRate()*getHoursWorked();
    }
}
