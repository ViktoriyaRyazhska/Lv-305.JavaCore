package lesson06_inheritance.practical;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("cat voice");
    }

    @Override
    public void feed() {
        System.out.println("cat feeding");
    }
}

