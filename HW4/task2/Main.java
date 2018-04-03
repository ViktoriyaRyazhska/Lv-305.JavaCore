package HW4.task2;

public class Main {
    private static UsefullMethods check = new UsefullMethods();

    public static void main(String[] args) {

        Dog Labrador = new Dog("Pes", 13, Breeds.LABRADOR);
        Dog Hasky = new Dog("Pes", 5, Breeds.HASKY);
        Dog Spaniel = new Dog("HyperPes", 3, Breeds.SPRANIEL);
        check.ifTwoDogsHasSameName(Labrador, Hasky, Spaniel);
        check.oldestDog(Labrador, Hasky, Spaniel);
    }

}
