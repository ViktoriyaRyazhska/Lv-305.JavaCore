package TASK2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
	public void task_2() throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number: ");
        int num = Integer.parseInt(br.readLine());
		
		        for (int i = 2; i<=num; i++) {
		            while (num % i == 0) {
		                num/= i;
		                System.out.println(i+" ");
		                
		            }
		}
	}
}
