

/*1. Write parameterized methods union(Set set1, Set set2) and
        intersect(Set set1, Set set2), realizing the operations of union
        and intersection of two sets. Test the operation of these
        techniques on two pre-filled sets.
      */


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {


    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(6);
        set1.add(3);
        set1.add(7);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(8);
        set2.add(1);
        set2.add(7);

        Intersect(set1, set2);
        Union(set1, set2);
        Union1(set1,set2);

    }

    public static void Intersect(java.util.Set<Integer> set1, java.util.Set<Integer> set2) {
        Set<Integer> test = new HashSet<>(set1);
        test.retainAll(set2);
        System.out.println(test);
    }

    public static void Union(java.util.Set<Integer> set1, java.util.Set<Integer> set2) {
        Set<Integer> test = new HashSet<>(set1);
        test.addAll(set2);
        System.out.println(test);


    }

    public static void Union1(java.util.Set<Integer> set1, java.util.Set<Integer> set2) {
        Set<Integer> test = new LinkedHashSet<>(set1);
        test.addAll(set2);
        System.out.println("Link" + test);/*// не знаю чи це треба не розумію як це
        вивести pre-filled sets*/
        System.out.println("old s1 sorted" + set1 + "old s2 sorted" + set2);
    }

}