package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car_main {

	public static void main(String[] args) throws IOException{
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      Car arr_c[]=new Car[4];
      String model;
      int year;
      int engine;
      for (int i = 0; i < arr_c.length; i++) {
    	  System.out.println("Input model of car:");
		model=br.readLine();
  	  System.out.println("Input year of production:");
		year=Integer.parseInt(br.readLine());
		  System.out.println("Input engine capacity of car");
		engine=Integer.parseInt(br.readLine());
		arr_c[i]= new Car(model,year,engine);
	}
  	  System.out.println("Input year:");
  	  year=Integer.parseInt(br.readLine());
  	  for (int i = 0; i < arr_c.length; i++) {
		if(arr_c[i].getYear_of_prod()==year)
		{
			System.out.println(arr_c[i].toString());
		}
	}
  	  Car tmp;
     for (int i = 0; i < arr_c.length-1; i++) {
		for (int j = i+1; j < arr_c.length; j++) {
			if(arr_c[i].getYear_of_prod()>arr_c[i].getYear_of_prod())
			{
				tmp=arr_c[i];
				arr_c[i]=arr_c[j];
				arr_c[j]=tmp;
				
			}
		}
	}
     for (int i = 0; i < arr_c.length; i++) {
    	 System.out.println(arr_c[i].toString());
		
	}
	}

}
