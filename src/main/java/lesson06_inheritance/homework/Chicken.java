package lesson06_inheritance.homework;

public class Chicken extends NonFlyingBird {
    @Override
    protected void fly() {
        System.out.println("chicken");
    }
}
