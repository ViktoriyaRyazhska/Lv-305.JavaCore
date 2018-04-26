import java.io.BufferedReader;
import java.util.Random;

public class Task9 implements Task{
	private final String task = "\tcalculating how many times were number one";

	@Override
    public void execute(BufferedReader bufferedReader) {
    	Random rand = new Random();
    	
    	private int getRand() {
    		int a = rand.nextInt(2);
    	}
    	private void times() {
    		int count = 0;
    		System.out.println("Input n: ");
    		int n = Integer.parseInt(bufferedReader.readLine());
    		for (int i : n) {
				if(i==1)
				{
					++count;
				}
			}
    		System.out.println(count);
    	}
    }

	@Override
	public String getTask() {
		return task;
	}
}
