import java.io.BufferedReader;
import java.io.IOException;
//BezborodovOleksandr
//Task4
public class Task4 {

    public void howMuchWordsInString(BufferedReader reader) throws IOException {
        System.out.println("Enter Line! ");
        String line = reader.readLine();
        int blockCount = line.split(" ").length;
        System.out.println("Words in line : " + blockCount);
    }
}
