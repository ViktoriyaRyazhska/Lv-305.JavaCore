
public class NumberToWords {
	private static String numberConvertor(int number) {
		String words = "";
		String singleDigitsArrey[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String doubleDigitsArrey[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninety" };

		if (number == 0) {
			return "zero";
		}
		if (number < 0) {
			String numberString = "" + number;
			numberString = numberString.substring(1);
			return "minus" + numberConvertor(Integer.parseInt(numberString));
		}
		if ((number / 1000000) > 0) {
			words += numberConvertor(number / 1000000) + "million";
			number %= 1000000;
		}

		if ((number / 100000) > 0) {
			words += numberConvertor(number / 100000) + "onehundredthousand";
			number %= 100000;
		}

		if ((number / 10000) > 0) {
			words += numberConvertor(number / 10000) + "tenthousand";
			number %= 10000;
		}
		if ((number / 1000) > 0) {
			words += numberConvertor(number / 1000) + "thousand";
			number %= 1000;
		}
		if ((number / 100) > 0) {
			words += numberConvertor(number / 100) + "hundred";
			number %= 100;
		}
		if (number > 0) {
			if (number < 20) {
				words +=singleDigitsArrey[number];
			}
			else {
				words +=doubleDigitsArrey[number /10];
				if ((number %10)> 0) {
					words += "-" + singleDigitsArrey[number % 10];
				}
			}
		}
		return words;
	}

	public static void main(String[] args) {
		System.out.println("Please type a number(max upto 9 digits)");
		
			number = Integer.parseInt(br.readLine());
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {
				System.out.print("Number in words: " + numberToWord(number));
			}
		
		
	}
	}
}
