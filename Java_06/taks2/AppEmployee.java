package homework6;

public class AppEmployee {

	public static void main(String[] args) {
		Employee[] em = new Employee[4];
		em[0] = new SalariedEmployee(101, "Andriy", "33d", 8540);
		em[1] = new SalariedEmployee(102, "Olga", "58a", 7600);
		em[2] = new ContractEmployee(151, "Oleg", "45454403", 42.2, 120);
		em[3] = new ContractEmployee(151, "Julia", "3884402", 48.8, 112);
		
		Employee tmp = new Employee() {

			@Override
			public int employeeld() {
				return 0;
			}

			@Override
			public double calculatePay() {
				return 0;
			}};
		for (int i = 0; i < em.length - 1; i++) {
		for (int j = i + 1; j < em.length; j++) {
		 if (em[i].calculatePay()<em[j].calculatePay()) {
			 tmp = em[i];
			 em[i] = em[j];
			 em[j] = tmp;
		 }
		 }
		}
		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i]);
		}
		
	}

}
