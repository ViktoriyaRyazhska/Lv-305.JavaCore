package HW7.task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Task1 task1 = new Task1();
        task1.intersect(set1,set2);
        task1.union(set1,set2);
    }

    <T> Set<T> union(Set<T> set1, Set<T> second){
        set1.addAll(second);
        return set1;
    }
    <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }
}
