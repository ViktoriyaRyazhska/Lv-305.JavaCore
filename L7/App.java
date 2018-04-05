/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson7;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Integer> first_1 = new LinkedList<>();
        List<Integer> second_2 = new LinkedList<>();
        Random random = new Random();
        System.out.println("First collection: ");
        for (int i = 0; i < 20; i++) {
            Integer element = random.nextInt(30);
            first_1.add(element);
            System.out.print(element + " ");
            if (element >= 5) {
                second_2.add(i);
            }
            if (element >= 20) {
                first_1.remove(element);
            }
        }
        System.out.println("\nFirst collection after all manipulations:");
        System.out.println(first_1);
        System.out.println("Second collection with indexes of elements grader than 5");
        System.out.println(second_2);

        System.out.println("Adding elements by index");
        if (first_1.size() >= 2) {
            first_1.add(2, 1);
        }
        if (first_1.size() >= 5) {
            first_1.add(5, -3);
        }
        if (first_1.size() >= 8) {
            first_1.add(8, -4);
        }
        int size = first_1.size();
        for (int i = 0; i < size; i++) {
            System.out.println("position – " + i
                    + ", value of element – " + first_1.get(i));
        }
        System.out.println("\nSorted collection: ");
        first_1.sort(Integer::compareTo);
        System.out.println(first_1);
    }
}
