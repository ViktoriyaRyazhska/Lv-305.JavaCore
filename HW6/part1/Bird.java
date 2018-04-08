package part1;

public abstract class Bird {
	private String feathers;
	private int layEggs;
	
	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	public abstract boolean fly();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("feathers - " + this.feathers + ", eggs - " + this.layEggs);
	}
	
	
}
