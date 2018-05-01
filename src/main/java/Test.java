import java.util.Arrays;

public class Test  {
    public static void main(String[] args) {
        int sum=0;
      int x=123;
        while (x!=0){
            sum+=(x%10);
            x/=10;
        }
        System.out.println(sum);

    }
}
