package ht3Employee;

public class m1 {

	public static void main(String[] args) {
		employee e1 = new employee("Max", 10.0, 100);
		employee e2 = new employee("Anna", 20.0, 150);
		employee e3 = new employee("Tanja", 30.0, 200);
		System.out.println(e1.rezum());
		System.out.println(e1.getName() + " bonuses are received $ " + e1.bonuses());
		System.out.println(e2.rezum());
		System.out.println(e2.getName() + " bonuses are received $ " + e1.bonuses());
		System.out.println(e3.rezum());
		System.out.println(e3.getName() + " bonuses are received $ " + e1.bonuses());
		System.out.print("Total salary: $");
		System.out.println(e1.getSalary() + e2.getSalary() + e3.getSalary());
		System.out.print("Total bonuses: $");
		System.out.println(e1.bonuses() + e2.bonuses() + e3.bonuses());
		System.out.print("Total hours: ");
		System.out.println(e1.getHours() + e2.getHours() + e3.getHours());

	}
}
