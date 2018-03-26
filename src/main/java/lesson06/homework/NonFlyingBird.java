package lesson06.homework;

public class NonFlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println("non flying");
    }
}
