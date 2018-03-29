package lesson05_collections.homework;

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
//        for(T i : first){
//            if (second.contains(i)) set.add(i);
//        }
        return set;
    }

    public static void main(String[] args) {
        UnionIntersect ui = new UnionIntersect();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set2.add(3);
        set2.add(5);
        set2.add(4);
//        System.out.println(ui.union(set,set2));
        System.out.println(ui.intersect(set,set2));
    }
}
