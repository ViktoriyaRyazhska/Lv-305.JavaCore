import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Chicken());
        birds.add(new Eagle());
        birds.add(new Eagle());
        birds.add(new Swallow());

        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i).getClass().getSimpleName());
            birds.get(i).fly();
        }



    }
}
