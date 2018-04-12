package part1;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Appl {

	public static void main(String[] args) {
		Set set1 = new TreeSet();
		Set set2 = new TreeSet();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			set1.add(rand.nextInt(30));
		}
		for (int i = 0; i < 10; i++) {
			set2.add(rand.nextInt(30));
		}
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		System.out.println();
		System.out.println(union(set1, set2));
		System.out.println();
		System.out.println(intersect(set1, set2));
	}

	public static Set union(Set set1, Set set2) {
		Set set3 = new TreeSet();
		Iterator iter = set1.iterator();
		while (iter.hasNext()) {
			set3.add(iter.next());
		}
		Iterator it = set2.iterator();
		while (it.hasNext()) {
			set3.add(it.next());
		}
		return set3;
	}
//?????????????????????????????
	public static Set intersect(Set set1, Set set2) {
		Set set3 = new TreeSet();
		set1.retainAll(set2);
		set3.addAll(set1);
		return set3;
	}

}
