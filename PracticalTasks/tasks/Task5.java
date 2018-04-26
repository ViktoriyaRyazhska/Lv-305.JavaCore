import java.io.BufferedReader;
import java.util.*;
class Task5
{

    public static void main(String args[])
    {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter the string");


        String st1=s.nextLine();

        StringBuffer sb = new StringBuffer(st1);


        sb.reverse();


        if(st1.equals(sb.toString()))
            System.out.println("Palindrome ");

    }

}