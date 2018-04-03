public class Circle extends Figure implements Interf1, Interf2{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (3.14 * (radius * 2));
	}
	
	public String getColor() {
		return "green";
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
