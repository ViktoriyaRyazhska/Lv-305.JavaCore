public class ApplAB {
	public static void main(String[] args) {

		ClassA a = new ClassA();
		System.out.println("Test ClassA.");
		a.m1(5);
		a.m2();
		a.m3();
		a.m4();
		
		System.out.println();
		ClassB b = new ClassB();
		System.out.println("Test ClassB.");
		b.m1();
		b.m2();
		b.m3();
		b.m4();

		System.out.println();
		ClassA b0 = new ClassB();
		System.out.println("Test_0 ClassB.");
		b0.m1(6);
		b0.m2();
		b0.m3();
		b0.m4();
	}
}
