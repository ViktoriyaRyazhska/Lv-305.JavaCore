package HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public double div() throws IOException,ArithmeticException
    {
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Input first double number");
    	double num1 = Double.parseDouble(br.readLine());
    	System.out.println("Input second double number");
    	double num2 = Double.parseDouble(br.readLine());
    if(num2==0) throw new ArithmeticException();
    	return num1/num2;
    }
    public static void main(String[] args)
    {
    	task1 t=new task1();
    	try 
    	{
    		double d =t.div();
    		System.out.println(d);
        }
    	catch(ArithmeticException e)
    	{
    		System.out.println("Error: division by zero ");
    	}
    	catch(IOException e)
    	{
    		System.out.println("Error: wrong type");
    	}
    	catch(Exception e)
    	{
    		System.out.println("Error");
    	}
    	
    }
}