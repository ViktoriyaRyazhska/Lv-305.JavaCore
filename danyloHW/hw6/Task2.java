package l9;

import java.util.*;


public class Task2 {
	
	

	public static void main(String[] args) {


        Set<Integer> set1 = new HashSet ();
        set1.add(2);
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(13);
        Set<Integer> set2 = new HashSet ();
        set2.add(9);
        set2.add(13);
        set2.add(0);
        set2.add(1);
        set2.add(5);
        

        // Set<Integer>
        Set<Integer> union = union(set1, set2);

        System.out.println(union);

        Set<Integer> intersesect = intersesect(set1, set2);

        System.out.println(intersesect);
    }

    public static<T>  Set<T> union (Set<T> set1, Set<T> set2) {

        Set set3 = new HashSet();
        set3.addAll(set1);
        set3.addAll(set2);

        return set3;

    }
    public static<T> Set<T> intersesect (Set<T> set1, Set<T> set2) {

        Set set4 = new HashSet();
        set4.addAll(set1);
        set4.retainAll(set2);

        return set4;
    }
}
