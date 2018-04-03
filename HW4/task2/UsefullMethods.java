package HW4.task2;

public class UsefullMethods {
    public void ifTwoDogsHasSameName(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName())) {
            System.out.println("Two dogs have same name");
        } else if (dog2.getName().equals(dog1.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("Two dogs have same name");
        } else if (dog3.getName().equals(dog1.getName()) || dog3.getName().equals(dog2.getName())) {
            System.out.println("Two dogs have same name");
        } else {
            System.out.println("Dogs have different names");
        }
    }
    public void oldestDog(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getAge() >= dog2.getAge() && dog1.getAge() >= dog3.getAge()){
            System.out.println(dog1.getName() + " "+ dog1.getBreed() + " Is older than " + dog2.getName() + " and " + dog3.getName());
        }
        else if (dog2.getAge() >= dog1.getAge() && dog2.getAge() >= dog3.getAge()){
            System.out.println(dog2.getName() + " "+ dog2.getBreed() + " Is older than " + dog1.getName() + " and " + dog3.getName());
        }
        else if (dog3.getAge() >= dog2.getAge() && dog3.getAge() >= dog1.getAge()){
            System.out.println(dog3.getName() + " "+ dog3.getBreed() + " Is older than " + dog2.getName() + " and " + dog1.getName());
        }
    }
}
