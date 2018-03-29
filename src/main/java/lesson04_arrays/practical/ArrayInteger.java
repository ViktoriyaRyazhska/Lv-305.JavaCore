package lesson04_arrays.practical;

import java.util.List;

import static java.util.Arrays.asList;


public class ArrayInteger {
    public static void main(String[] args) {
        Integer[] array = {1, -2, -3, -4, -5, 6, -7, -8, 9, 10};
        List<Integer> arrayList = asList(array);
        System.out.println("max number " + arrayList.stream().max(Integer::compareTo).get());
        System.out.println("sum of positive numbers: " + arrayList.stream().filter(x -> x >0).reduce(0, (x, y) -> x + y));
        long neg=arrayList.stream().filter(x -> x <= 0).count();
        System.out.println("amount of negative numbers: " + neg);
        if(neg>array.length/2) System.out.println("more negative values");
        if(neg<array.length/2) System.out.println("more positive values");
        if(neg==array.length/2) System.out.println("negative equal positive");
    }

}
