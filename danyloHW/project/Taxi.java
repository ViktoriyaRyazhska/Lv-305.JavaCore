package l777;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Taxi extends Main {

	public double getFareRate(String startTime) throws ParseException {

		SimpleDateFormat timeFormatParser = new SimpleDateFormat("HH:mm");
		//
		Date peakTimeStart = timeFormatParser.parse("16:00");
		Date peakTimeEnd = timeFormatParser.parse("19:00");
		Date nightStart = timeFormatParser.parse("0:00");
		Date nightEnd = timeFormatParser.parse("6:00");
		//
		Date startTimeAsDate = timeFormatParser.parse(startTime);
		if (startTimeAsDate.after(peakTimeStart) && startTimeAsDate.before(peakTimeEnd)) {
			return 2d;
		} else if (startTimeAsDate.after(nightStart) && startTimeAsDate.before(nightEnd)) {
			return 7.4d;
		} else {
			return 5.6d;
		}

	}

	void calculator() throws ArithmeticException, ParseException, IOException {
		System.out.println("--- Stage 2 Taxi Fare Calculator ---");
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter in pick up time:  ");
		System.out.flush();
		String startTime = scan.next();

		System.out.print("Enter in pickup point:  ");
		System.out.flush();
		String pickUp = scan.next();

		System.out.print("Enter in drop off point:  ");
		System.out.flush();
		String dropOff = scan.next();

		System.out.print("Enter in trip distance in km:  ");
		System.out.flush();
		Double tripDist = scan.nextDouble();
		scan.nextLine();

		Double fareRate = getFareRate(startTime);
		Double baseFare = tripDist * fareRate;
		Double totalFare = baseFare;
		String m1 = "The pickup point was: %15s%n";
		String m2 = "The drop off point was: %13s%n";
		String m3 = "The pickup time was: %16s%n";
		String m4 = "Estimated distance (km): %12f%n";
		String m5 = "Fare Charged: UAH%20.2f%n";
		String m6 = "Total fare: UAH%22.2f%n";

		System.out.println(" --- Taxi fare simulator --- ");
		System.out.printf(m1, pickUp);
		System.out.printf(m2, dropOff);
		System.out.printf(m3, startTime);
		System.out.printf(m4, tripDist);
		System.out.printf(m5, fareRate);
		System.out.printf(m6, totalFare);
	}

}
