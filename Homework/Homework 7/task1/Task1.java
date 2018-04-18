package task1;
import java.util.HashSet;
import java.util.Set;

/*
Write parameterized methods union(Set set1, Set set2) 
and intersect(Set set1, Set set2), realizing the operations of union 
and intersection of two sets. Test the operation of these techniques on two pre-filled sets. 
*/


public class Task1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		set1.add("cat");
		set1.add("dog");
		set1.add("mouse");
		set1.add("rabbit");
		set1.add("chicken");
		
		set2.add("cow");
		set2.add("rabbit");
		set2.add("hourse");
		set2.add("pig");
		set2.add("cat");
	
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(Sets.union(set1, set2));
		System.out.println(Sets.intersect(set1, set2));
	}
	
}
