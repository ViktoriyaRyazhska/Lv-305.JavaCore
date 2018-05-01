package Fruits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit());
        fruits.add(new Fruit());
        fruits.add(new Fruit());
        fruits.add(new Citrus());
        fruits.add(new Citrus());
        for (Fruit fruit : fruits){
            fruit.input();
        }

        fruits.stream().filter(x->x.color.equals("yellow")).forEach(Fruit::print);

        fruits=fruits.stream().sorted().collect(Collectors.toList());




    }

}
