public class WrapperBox {
	private Box box = new Box();

	public void set(String text) {
		this.box.set(text);
	}

	public String get() {
		return (String) box.get();
	}
}
