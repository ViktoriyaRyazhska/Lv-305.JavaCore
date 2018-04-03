public class ClassA {
	public int i = 1;

	public void m1(Integer x) {
		x=3;
		System.out.println("ClassA, metod m1, i = " + i);
	}

	public void m2() {
		System.out.println("ClassA, metod m2, i = " + i);
	}

	public void m3() {
		System.out.print("ClassA, metod m3, runnind m4():");
		m4();
	}

	public void m4() {
		System.out.println("ClassA, metod m4");
	}
}
