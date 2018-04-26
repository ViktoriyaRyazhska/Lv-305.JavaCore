import java.io.BufferedReader;
import java.io.IOException;


public class Third {
	private double usd;
	private double uah;

	
	public Third(double usd, double uah) {
		super();
		this.usd = usd;
		this.uah = uah;
	}
	void calculateUahToUsd(BufferedReader reader) throws NumberFormatException, IOException {
		
		//reader.readLine();
		double uah = 25.9;
		double usd = Double.parseDouble(reader.readLine());
		double result = uah * usd;
		System.out.println(result);
		
	}
	public double getUsd() {
		return usd;
	}
	public void setUsd(double usd) {
		this.usd = usd;
	}
	public double getUah() {
		return uah;
	}
	public void setUah(double uah) {
		this.uah = uah;
	}

}
