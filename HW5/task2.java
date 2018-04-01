package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

	public static void main(String[] args)throws IOException {
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      boolean s=true;
      int sum=0;
      int prod=1;
      int[] arr=new int[10];
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=Integer.parseInt(br.readLine());
      }
      for (int i = 0; i < arr.length; i++) 
      {
		 if(arr[i]<0)
		{   s=false;
		    break;
		}
	  }
      for (int i = 0; i < arr.length; i++) 
      { 
    	  if(s&&i<5)
    	  {
    		  sum+=arr[i];
    		  
    	  }
    	  else if(s==false&&i>4)
    	  {
    		  prod*=arr[i];
    	  }
 
      }
      if(s)
      System.out.println("The sum of first 5 elements:"+sum);
      else
    	  System.out.println("Product of last 5 element:"+prod );

	}

}
