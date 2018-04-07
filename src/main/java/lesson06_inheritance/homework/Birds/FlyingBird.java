package lesson06_inheritance.homework.Birds;

public class FlyingBird extends Bird{
    @Override
    protected void fly() {
        System.out.println("flying");
    }
}
