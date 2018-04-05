public class nonFlyingBird extends bird {

	public String fly() {
		return " can't fly";
	}

	public nonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}
}