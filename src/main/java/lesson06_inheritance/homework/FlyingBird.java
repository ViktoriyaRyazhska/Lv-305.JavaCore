package lesson06_inheritance.homework;

public class FlyingBird extends Bird{
    @Override
    protected void fly() {
        System.out.println("flying");
    }
}
