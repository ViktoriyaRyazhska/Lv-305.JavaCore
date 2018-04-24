import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
 realizing the operations of union and intersection of two sets.
 Test the operation of these techniques on two pre-filled sets.
 */
public class UnionIntersect {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6, 7, 8));

        System.out.println("set1: " + set1 + "\n" + "set2: " + set2);

        //union operation
        union(set1, set2);

        //intersection operation
        intersect(set1, set2);

    }

    public static void union(Set set1, Set set2){

        set1.addAll(set2);

        System.out.println("set1 after union: " + set1);
    }

    public static void intersect(Set set1, Set set2){

        set1.retainAll(set2);

        System.out.println("set 2 after intersection: " + set1);
    }
}
