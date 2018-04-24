import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadNumber {
    public Integer readNumber () throws IOException, MyNumberException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter start and end number");
        try{
            int start = Integer.parseInt(br.readLine());
            int end = Integer.parseInt(br.readLine());
            System.out.println("Enter number");
            int a = Integer.parseInt(br.readLine());
            if (( a >= start )&&(a <= end)){
                return a;
            }else {
                throw new MyNumberException("Invalid number");
            }
        }catch (NumberFormatException e){
            throw new MyNumberException ("Not a number");
        }
    }
}
