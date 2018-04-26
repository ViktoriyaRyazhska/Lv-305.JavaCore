import java.io.BufferedReader;
import java.io.IOException;
//OleksandrBezborodov
public class Task9 {

    public int getRandom() {
        double random = Math.random();
        if (random <= 0.5) {
            return 0;
        }
        return 1;
    }
    public void input(BufferedReader reader) throws IOException, Exception {
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = getRandom();
            if (temp==1){
                count++;
            }
        }
        System.out.println("Number 1 was " + count +" times.");
    }

}
