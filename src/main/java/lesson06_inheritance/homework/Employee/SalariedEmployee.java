package lesson06_inheritance.homework.Employee;

public class SalariedEmployee extends Employee {
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

  @Override
  public double calculatePay() {
    return getMonthPayment();
  }
}


