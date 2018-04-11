package HW5.task2;

public class Main {
    public static void main(String[] args) {
        CalculateOperations calculateOperations =  new CalculateOperations();

        calculateOperations.InitializeArray(10);
        System.out.println(calculateOperations.calculateSumOrProduct());
    }
}
