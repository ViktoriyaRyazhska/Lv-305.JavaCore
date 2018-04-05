public abstract class bird {
	String feathers;
	String layEggs;

	public abstract String fly();

	public bird(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String toString() {
		return "Bird " + feathers + " " + layEggs + " and";
	}
}