import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Stream;

public class Task6 {
	

	public static void foo(BufferedReader reader) throws IOException{
	//	String text = reader.readLine();
		String text;
		text =reader.readLine();
		String[] arr = text.split(" ");
		System.out.println(arr.length);

	
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		foo(reader);
	
}
	}
