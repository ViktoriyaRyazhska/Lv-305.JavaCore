package lesson05_collections.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersect {
    <T> Set<T> union(Set<T> first, Set<T> second){
        first.addAll(second);
        return first;
    }
    <T> Set<T> intersect(Set<T> first, Set<T> second){
        Set<T> set = new HashSet<>(first);
        set.retainAll(second);
        return set;
    }

    public static void main(String[] args) {
        UnionIntersect ui = new UnionIntersect();
        Set<Integer> set = new HashSet<>(Arrays.asList(1,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1,5,6));

        System.out.println(ui.union(set,set2));
        System.out.println(ui.intersect(set,set2));
    }
}
