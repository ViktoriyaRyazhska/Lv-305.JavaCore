package l3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FlowerBed {


	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius :");
    float r=sc.nextFloat();
    double area =  Math.PI * Math.pow(r, 2);
    double per = 2 * Math.PI * r;
    
    DecimalFormat df = new DecimalFormat("###.##");
    System.out.println("Area :" + df.format(area));
    System.out.println("Perimeter :" + df.format(per));
    		
	}

}
