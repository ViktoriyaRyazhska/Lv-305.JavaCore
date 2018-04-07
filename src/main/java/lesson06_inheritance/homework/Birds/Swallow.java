package lesson06_inheritance.homework.Birds;

public class Swallow extends FlyingBird {
    @Override
    protected void fly() {
        System.out.println("swallow");
    }
}
