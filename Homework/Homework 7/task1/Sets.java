package task1;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static Set<String> union(Set<String> set1, Set<String> set2) {
		Set<String> sets = new HashSet<String>(set1);
		sets.addAll(set2);
		return sets;
		
	}
	public static Set<String> intersect(Set<String> set1, Set<String> set2) {
		Set<String> sets = new HashSet<String>(set1);
		sets.retainAll(set2);
		return sets;
		
	}
}
