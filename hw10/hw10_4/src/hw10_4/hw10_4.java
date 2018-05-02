package hw10_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class hw10_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\Victor\\Home task\\file1.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String str;
		String longestLine = new String();
		List<String> list = new ArrayList<String>();
		while ((str = br.readLine()) != null) {
			list.add(str);
			if (longestLine.length() < str.length()) {
				longestLine = str;
			}
		}
		br.close();
		LineNumberReader dnr = new LineNumberReader(new FileReader(new File("D:\\Victor\\Home task\\file1.txt")));
		dnr.skip(Long.MAX_VALUE);
		dnr.close();

		try (FileWriter fileWr = new FileWriter("D:\\Victor\\Home task\\file2.txt", false)) {
			fileWr.write("Number of lines: " + list.size() + "; ");
			fileWr.write("Longest line: " + longestLine + "; ");
			fileWr.write("My name is: " + list.get(1) + " " + list.get(2) + " my birthday on " + list.get(0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// output
	// Number of lines: 5; Longest line: 33 years old; My name is: Victor Malinochka
	// my birthday on 12.09.1984
}
