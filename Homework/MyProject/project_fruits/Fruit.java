package project_fruits;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Fruit implements Serializable {

	protected String fruitName;
	protected String fruitColor;

	public Fruit() {
	}

	public Fruit(String fruitName, String fruitColor) {
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please enter your fruitname");
		this.fruitName = br.readLine();

		System.out.println("Please enter your fruitColor");
		this.fruitColor = br.readLine();

	}

	void input(ObjectOutputStream objectOutputStream) throws IOException {

		objectOutputStream.writeObject(this);

	}

	public void output() {
		System.out.println("Fruit: " + getFruitName() + "; Color: " + getFruitColor() + ".");
	}

	@Override
	public String toString() {

		return ("Fruit: " + this.fruitName + "; Color: " + this.fruitColor + ".");
	}

}
