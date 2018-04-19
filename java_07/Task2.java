import java.util.List;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//        • Є менш двох осіб з однаковим першим іменем
//        серед цих 10 людей?
//        • Видалити з карти особа, чиє ім'я - "Orest"
//        (або інше). Результат друку.*/
public class Task2 {


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) throws IOException{


        Map<String, String> map = new HashMap<String, String>();
        map.put("Gering", "Stive");
        map.put("Grinvich", "Bob");
        map.put("Stasov", "Vovs");
        map.put("Sorin", "Bob");
        map.put("Loblan", "Josh");
        map.put("Chopkins", "Felix");
        map.put("Chopin", "Vova");
        map.put("Creck", "Jonatan");
        map.put("Kovich", "Vova");
        map.put("Kolin", "Odri");

        for (Map.Entry<String, String> i : map.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        System.out.println("");

        List<String> name = new ArrayList<>();

        List<String> key = new ArrayList<>();
        for (Map.Entry<String, String> temp : map.entrySet())
                {
                    if (name.contains(temp.getValue())) {
                        key.add(temp.getKey());
                    } else {
                        name.add(temp.getValue());
                    }
        }
        for (String c : key) {
            System.out.println(key);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name what you want to delite : ");
        String input = sc.nextLine();
        map.remove(input);
        System.out.println(input);
        for (Map.Entry<String, String> k : map.entrySet()) {
            System.out.println(k.getKey()+ " " + k.getValue());

        }
        }


}




















