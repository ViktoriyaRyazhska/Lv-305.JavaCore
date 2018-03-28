package hw_3;

import java.util.Scanner;

public class MInMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter 3 number: " ); 
		  int max =0 ; 
		  int min =0; 
		int   a = sc.nextInt();
		 int  b = sc.nextInt();
		  int c = sc.nextInt();	
		  
//		int a = 1 ; // Якщо без сканера
//		int b = 2;
//		int c = 3 ;
//		
		
		if (a>=c && a>=b)  {max = a ; }
		if (a<=c && a<=b)  {min = a ; }
		if (b>=c && b >=a) {max = b ;}
		if (b<=c && b <=a) {min = b ;}
		if (c>=a && c >= b) {max = c ;}  
		if (c<=a && c <= b) {min = c ;}  /// не виходить else запитати
		
	 	System.out.println("min "+min +" max " + max );

	}

}
