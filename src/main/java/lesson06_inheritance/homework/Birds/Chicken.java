package lesson06_inheritance.homework.Birds;

public class Chicken extends NonFlyingBird {
    @Override
    protected void fly() {
        System.out.println("chicken");
    }
}
