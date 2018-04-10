package hw5_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw5_3 {

		public static void main(String[] args) throws NumberFormatException, IOException 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int number[] = new int[5];
			System.out.println("Enter five numbers: ");

			for (int i = 0; i < number.length; i++) 
			{
			number[i] = Integer.parseInt(br.readLine());
			}

			int second = 0;
			int position = 0;

			for (int i = 0; i < number.length; i++) 
			{
				if (number[i] > 0) 
				{
					second++;
				}
				if(second==2)
				{
				position = i;
				break;
				}
			}
				System.out.println("Second positive number is on " + (position + 1) + " position.");
	}
}
