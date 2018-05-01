package Fruits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Утворити List фруктів і додати до нього 5 різних фруктів і цитрусів.
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit());
        fruits.add(new Fruit());
        fruits.add(new Fruit());
        fruits.add(new Citrus());
        fruits.add(new Citrus());
        for (Fruit fruit : fruits){
            fruit.input();
        }

        //Видрукувати дані про ті фрукти, колір яких є 'жовтий'.
        fruits.stream().filter(x->x.color.equals("yellow")).forEach(Fruit::print);


        //Посортувати список фруктів за назвою і результат вивести у файл
        try {
            fruits.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"));
            fruits.forEach(x->x.print(ois));
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
