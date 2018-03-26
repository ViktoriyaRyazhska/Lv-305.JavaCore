package lesson06.homework;

public class Penguin extends NonFlyingBird {
    @Override
    protected void fly() {
        System.out.println("penguin");
    }
}
