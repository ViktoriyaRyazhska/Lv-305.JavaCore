
public class Employee {
	private String name;
	private int rate;
	private int hours;

	private static double totalSum = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		totalSum = totalSum - this.rate * this.hours;
		this.rate = rate;
		totalSum = totalSum + this.rate * this.hours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		totalSum = totalSum - this.rate * this.hours;
		this.hours = hours;
		totalSum = totalSum + this.rate * this.hours;
	}

	public Employee() {
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + this.rate * this.hours;
	}

	public int salary() {
		return this.rate * this.hours;
	}

	@Override
	public String toString() {
		return "Employee(name = " + this.name + " rate = " + this.rate + " hours = " + this.hours + ")";
	}

	public int changeRate(int rate) {
		totalSum = totalSum - this.rate * this.hours;
		this.rate = rate;
		totalSum = totalSum + this.rate * this.hours;
		return this.rate;
	}

	private double bonuses() {
		return this.salary() * 0.1;
	}

	private static double totalSalary() {
//		double totalSalary = this.bonuses() + this.salary();
//		totalSum += totalSalary;
		return totalSum * 1.1;
	}

	public void printOn() {
		System.out.println(this.salary() + this.bonuses());
	}

	public static void totalSumma() {
		System.out.println(totalSalary());
	}

}
