import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ht1_2 {

	
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
	new InputStreamReader(System.in));

    	System.out.println("�� ��� �����");
    	String name = br.readLine();

    	System.out.println("� ����� ��� �� ��������� " + name);
    	String adressSity = br.readLine();

    	System.out.println("�� ��� ������ �� ���������");
    	String adressStreet = br.readLine();

    	System.out.print("��� ����� " + name + ", ");  
    	System.out.print("�� ������ � ��� " + adressSity + ", ");
    	System.out.print("�� ������ " + adressStreet + ".");
  }
}