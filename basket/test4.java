import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {

	public static void main(String[] args) throws IOException {

		BufferedReader BuffRd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter month, for exampel<SePtEmBeR]>: ");
		String input = BuffRd.readLine();
		
		System.out.println("You entered month: "+ input);
		
		switch (input.toUpperCase()) {
		case "DESEMBER":
		case "JANUARY":
		case "FEBRUARY":
			Season season = Season.WINTER;
			//System.out.println("You entered month: "+ input);
			System.out.println(season + " is cool");
			break;
		case "MARTH": case "APRIL":case "MAY":
			season = Season.SPRING;
			System.out.println(season + " is the season after winter and before summer");
			break;

		case "JUNE": case "JULE": case "AUGUST":
			season = Season.SUMMER;
			System.out.println(season + " is the hottest of the four temperate seasons");
			break;

		case "SEPTEMBER": case "OCTOBER": case "NOVEMBER":
			season = Season.AUTUMN;
			System.out.println(season + " season of the year between summer and winte");
			break;
			
		default:
			System.out.println("Everything is bad, try again ");
			System.exit(0);
		}

	}
}
