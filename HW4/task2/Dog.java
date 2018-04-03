package HW4.task2;

public class Dog {
    private String name = "";
    private int age = 0;
    private Breeds breed;


    public Dog(String name, int age, Breeds breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breeds getBreed() {
        return breed;
    }
}
