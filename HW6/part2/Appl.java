package part2;

public class Appl {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new SalariedEmployee("SalariedEmployee", "John", 124125, 30, 160);
		emp[1] = new ContractEmployee("ContractEmployee", "Olya", 1549, 56200);
		emp[2] = new SalariedEmployee("SalariedEmployee", "Andrew", 135848, 45, 150);
		emp[3] = new ContractEmployee("ContractEmployee", "Jack", 5687501, 5700);
		
		Employee tmp;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i+1; j < emp.length; j++) {
				if(emp[i].calculatePay() < emp[j].calculatePay()) {
					tmp = emp[i];
					emp[i] = emp[j];
					emp[j] = tmp;
				}
			}
		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}
		
		
	}

}
