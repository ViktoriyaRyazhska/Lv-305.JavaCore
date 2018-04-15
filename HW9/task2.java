package HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
	public int readNumber(int start, int end)throws IOException,ArithmeticException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		if(num<start||num>end)
			throw new ArithmeticException();
		else
		return num;
		
			
	}
    public static void main(String[] args)
    {
    	task2 t =new task2();
    	int n;
    	try
    	{
    		for(int i=0;i<10;i++) {
    			n=t.readNumber(1,10);
    		    System.out.println(n);
    		}
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Your number is't in the right range");
    	}
    	catch(IOException e)
    	{
    		System.out.println("Wrong type");
    	}
    	catch(Exception e)
    	{
    		System.out.println("Error");
    	}
    }


}
