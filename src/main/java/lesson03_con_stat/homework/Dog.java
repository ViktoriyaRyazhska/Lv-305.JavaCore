package lesson03_con_stat.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
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
    static boolean checkSameName(List<Dog> list,Dog dog){
        boolean result=false;
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.addAll(list);
        dogs.remove(dog);
        for(Dog d : dogs){
            if (dog.getName().equals(d.getName())){ result=true;}
        }
        return result;
   }
   static void checkSameNames(List<Dog> dog){
        boolean result = false;
        for(Dog d : dog){
           if(checkSameName(dog,d)){
               result=true;
           }
        }
       if(result) System.out.println("there are some dogs with same names");
       else System.out.println("there are no name matches");
   }

   static void oldestDog(List<Dog> list){
        Dog returnDog = list.stream().max(Comparator.comparingInt(Dog::getAge)).get();
        System.out.println(String.format("The oldest dog name : %s , breed : %s",returnDog.getName(), returnDog.breed));
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("first",1,Breed.FIRSTBREED);
        Dog dog2 = new Dog("second",2,Breed.SECONDBREED);
        Dog dog3 = new Dog("third",3,Breed.THIRDBREED);
        ArrayList<Dog> list = new ArrayList<>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        oldestDog(list);
        checkSameNames(list);


    }
}
enum Breed{
    FIRSTBREED, SECONDBREED,THIRDBREED;

}
