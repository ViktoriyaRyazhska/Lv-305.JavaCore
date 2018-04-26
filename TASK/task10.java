package TASK2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task10 {
	public void task_2()throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input number greater than one:");
			int  num =Integer.parseInt(br.readLine());
	
		int i=0;
		for( i=0;num!=1;i++)
		{
			
			if(num%2==0)
			{
				num/=2;
			}
			else
			{
				num*=3;
				num++;
			}
			
		}
		System.out.println("Numbers of step: "+i);
	}

}
