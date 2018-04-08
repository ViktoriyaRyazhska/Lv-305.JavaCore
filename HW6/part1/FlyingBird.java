package part1;

public class FlyingBird extends Bird {
	
	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public final boolean fly() {
		return true;
	}

}
