package lesson06_inheritance.practical;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("dog voice");
    }

    @Override
    public void feed() {
        System.out.println("dog feeding");
    }

    public static void main(String[] args) {
        Animal[] arr = new Animal[2];
        arr[0] = new Cat();
        arr[1] = new Dog();
        for(Animal animal : arr ){
                animal.voice();
                animal.feed();
        }
    }
}

