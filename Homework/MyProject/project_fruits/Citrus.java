package project_fruits;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Citrus extends Fruit {
	private double vitaminCcontent;

	public Citrus() {

	}

	public Citrus(String fruitName, String fruitColor, double vitaminCcontent) {
		super(fruitName, fruitColor);
		this.vitaminCcontent = vitaminCcontent;
	}

	public double getVitaminCcontent() {
		return vitaminCcontent;
	}

	public void setVitaminCcontent(double vitaminCcontent) {
		this.vitaminCcontent = vitaminCcontent;
	}

	@Override
	public void input() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please enter name of your citrus fruit");
		this.fruitName = br.readLine();

		System.out.println("Please enter color of your citrus fruit");
		this.fruitColor = br.readLine();

		System.out.println("Please enter vitamin C content");
		this.vitaminCcontent = Double.parseDouble(br.readLine());
	}

	@Override
	void input(ObjectOutputStream objectOutputStream) throws IOException {

		objectOutputStream.writeObject(this);

	}

	@Override
	public void output() {
		System.out.println("Fruit: " + getFruitName() + "; Color: " + getFruitColor() + "; Vitamin C content: "
				+ getVitaminCcontent() + ".");
	}

	@Override
	public String toString() {
		return ("Fruit: " + this.fruitName + "; Color: " + this.fruitColor + "; Vitamin C content: "
				+ this.vitaminCcontent + ".");
	}

}
