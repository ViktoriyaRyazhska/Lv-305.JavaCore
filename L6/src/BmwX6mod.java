public class BmwX6mod extends BmwX6 {
	public BmwX6mod() {
		super();
		//
	}

	@Override
	public void workedEngine() {
		System.out.println("BmwX6mod: Engine  Running on Diesel.");
		System.out.println("BmwX6mod: Max Speed: " + getMaxSpeed());
	}

	@Override
	public void lightsShine() {
		System.out.println("BmwX6mod: Xenon Headlights.");
		super.lightsShine();
	}
}
