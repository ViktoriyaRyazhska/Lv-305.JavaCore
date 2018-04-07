package lesson06_inheritance.homework.Birds;

public class Eagle extends FlyingBird {
    @Override
    protected void fly() {
        System.out.println("Eagle");
    }
}
