package hw_3;
import java.util.Scanner;

public class Http {
	public enum Http_error {
		Badrequest , Unauthorized , PaymentRequired 
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter error 400 , 401 ,402 ");
		String error= sc.nextLine();
		Http_error  errorenum  = null;
		
		
		 	switch(error) {
		 	case "400": errorenum = Http_error.Badrequest; 
		 	break;
		 	case "401": errorenum = Http_error.Unauthorized;
		 	break; 
		 	case "402" : errorenum = Http_error.PaymentRequired;
		 	break;
		 	}
			System.out.println(errorenum);
			
	
	}}