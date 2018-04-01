package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task4 {

	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       int [] arr=new int [30];
       int pr=1;
       int t=0;
for (int i = 0; i < arr.length; i++)
     {
	System.out.println("Input arr["+i+"]");
	pr=Integer.parseInt(br.readLine());
	if(pr>=0)
	    {
		arr[i]=pr;
	    }
	else 
   	{
		t=i;
		break;
   	}
       	
      }
   pr=1;
  for (int i = 0; i < t; i++) 
  {
	pr*=arr[i];
  } 
  System.out.println("Product:"+pr);
  }
}


