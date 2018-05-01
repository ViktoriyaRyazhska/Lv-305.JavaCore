package task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		String file1 = "file1.txt";
		String file2 = "file2.txt";
		List<String> text = new ArrayList<String>();
		String s;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file1));
			while ((s = br.readLine()) != null) {
				text.add(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int longest = text.get(0).length();
		String longestLine = "";
		for (int i = 1; i < text.size(); i++) {
			if (longest < text.get(i).length()) {
				longest = text.get(i).length();
				longestLine = text.get(i);
			}
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
			bw.write("1)Number of lines in file1.txt = " + text.size() + "\n2)The longest line: " + longestLine
					+ "\n3)Dmytro 11.11.2000");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
