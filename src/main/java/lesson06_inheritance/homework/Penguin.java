package lesson06_inheritance.homework;

public class Penguin extends NonFlyingBird {
    @Override
    protected void fly() {
        System.out.println("penguin");
    }
}
