package task2;

public class ContractEmployee extends Employee implements CalculatePay {
    private String federalTaxIdMember;
    private double hoursWorked;
    private double hourlyRate;


    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdmember;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdMember = federalTaxIdmember;
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


    public double calculatePay() {
        return getHourlyRate()*getHoursWorked();
    }
}