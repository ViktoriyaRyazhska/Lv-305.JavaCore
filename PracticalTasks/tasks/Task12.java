package task;

public class Task12 {

	private int sum = 0;

	int getSum() {
		for (int i = 1; i < 1001; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += 1;
			}
		}
		return sum;
	}
	
}
