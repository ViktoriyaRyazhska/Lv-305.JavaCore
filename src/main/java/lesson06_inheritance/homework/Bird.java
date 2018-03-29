package lesson06_inheritance.homework;

import java.util.ArrayList;
import java.util.List;

public abstract class Bird {
    protected int feathers;
    protected int layEggs;
    protected abstract void fly();

    public static void main(String[] args) {
        List<Bird> list = new ArrayList<>();
        list.add(new Chicken());
        list.add(new Eagle());
        list.add(new FlyingBird());
        list.add(new NonFlyingBird());
        list.add(new Penguin());
        list.add(new Swallow());
        list.forEach(Bird::fly);
    }
}
