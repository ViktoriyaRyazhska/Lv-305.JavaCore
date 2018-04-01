package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {

	public static void main(String[] args)throws IOException {
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  int arr[]=new int[5];
  for (int i = 0; i < arr.length; i++)
   {
	  System.out.println("Inpuut arr["+i+"]");
		arr[i]=Integer.parseInt(br.readLine());
		}
   int p=0;
   int pos=0;
   for (int i = 0; i < arr.length; i++) 
   {
	if(arr[i]>0)
		p++;
	if(p==2)
	{
	pos=i;
    }
   }
	int min=arr[0];
	int pos_min=0;
	for (int i = 0; i < arr.length; i++) 
	{
		if(min>arr[i])
	      {
			min=arr[i];
		    pos_min=i;
		  }
		}
	System.out.println("Position of second positive number:"+pos);
	System.out.println("Minimum of array:"+min);
	System.out.println("Position of minimum in the array:"+pos_min);


	
	}
	}


