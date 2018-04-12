package task2;

public class SalariedEmployee extends Employee implements CalculatePay {
    String socialSecurityNumber;
    private double monthPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double monthPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthPayment = monthPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public double getMonthPayment() {
        return monthPayment;
    }

    public double calculatePay() {
        return getMonthPayment();
    }
}
