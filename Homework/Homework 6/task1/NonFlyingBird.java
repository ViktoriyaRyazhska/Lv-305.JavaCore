package task1;

public class NonFlyingBird extends Bird{

	public NonFlyingBird(String feathers, int leyEggs) {
		super(feathers, leyEggs);
		
	}

	@Override
	public String fly() {
		return "I can't fly";
		
	}

}
