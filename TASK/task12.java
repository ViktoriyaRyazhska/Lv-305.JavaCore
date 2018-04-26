
public class task12 {

	public void natNumb() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
	}
		System.out.println(sum);
	}	
	public static void main(String[] args) {
		task12 t = new task12();
		t.natNumb();
	}

}
