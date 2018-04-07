package lesson06_inheritance.homework.Birds;

public class NonFlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println("non flying");
    }
}
