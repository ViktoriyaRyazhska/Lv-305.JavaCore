package part1;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public final boolean fly() {
		return false;
	}

}
