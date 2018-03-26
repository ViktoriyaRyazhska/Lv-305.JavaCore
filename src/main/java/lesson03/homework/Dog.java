package lesson03.homework;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    String s(int n){
        return "2"+n;
    }
}
enum Breed{
    FIRST;

}
