package HW10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class task4 {

	public static void main(String[] args) 
	{
		String t ="file1.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		List<String> text = new ArrayList<String>();

		String s = null;
		try {
			br = new BufferedReader(new FileReader(t));
			while ((s = br.readLine()) != null) {
				text.add(s);

			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int max = text.get(0).length();
		String max_s=null;

		for (int i = 1; i < text.size(); i++) {
			if (max < text.get(i).length()) {
				max = text.get(i).length();
				max_s = text.get(i);
			}

	    }
		String t2 ="file2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(t2));
			bw.write("1)"+text.size()+'\n'+"2)"+max_s+'\n'+"3)Andrii 13.12.1999" );
			
			bw.close();
			
		}

		catch (Exception e) {
			e.printStackTrace();
			}


		
  }
}
