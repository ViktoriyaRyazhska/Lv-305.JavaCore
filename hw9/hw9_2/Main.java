import java.io.IOException;

public class Main {
    public static void main (String[] args){
            ReadNumber number = new ReadNumber();
        try {
            for (int i=0; i<10; i++){

                number.readNumber();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (MyNumberException e){
            System.out.println(e.getMessage());
        }
    }
}

