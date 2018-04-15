package HW7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task1 {
	public <T>Set<T>union(Set<T> set1, Set<T> set2) 
	{
		Set<T> set =new HashSet<>();
		set.addAll(set1);
		set.addAll(set2);
		return set;
		
	}
	public <T>Set<T>intersect(Set<T> set1, Set<T> set2) 
	{
		Set<T> set =new HashSet<>();
		set.addAll(set1);
		set.retainAll(set2);
		return set;

	}

	public static void main(String[] args) 
	{
		task1 t =new task1();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Random rand =new Random();
		for (int i = 0; i < 20; i++) 
		{
			set1.add(rand.nextInt(50));
			
		}
        for (int i = 0; i < 20; i++) 
        {
        	set2.add(rand.nextInt(50));
			
		}
        System.out.println(t.union(set1, set2));
        System.out.println(t.intersect(set1, set2));
	}

}
