package lesson7.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {

    public static Set union(Set set1, Set set2) {
        Set result = new HashSet(set1);
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        return result;
    }

    public static Set intersect(Set set1, Set set2) {
        Set result = new HashSet(set1);
        result.retainAll(set2);
        return result;
    }
}
