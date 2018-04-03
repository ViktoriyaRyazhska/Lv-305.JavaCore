public class Rectangle extends Figure {
  private double length, width;
		
  public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
  }
		
  @Override
  public double getArea() {
	  return this.length * this.width;
  }
  
}
