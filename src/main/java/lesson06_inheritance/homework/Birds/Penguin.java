package lesson06_inheritance.homework.Birds;

public class Penguin extends NonFlyingBird {
    @Override
    protected void fly() {
        System.out.println("penguin");
    }
}
