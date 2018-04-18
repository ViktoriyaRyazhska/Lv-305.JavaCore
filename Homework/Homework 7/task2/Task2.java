//Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
//Output the entities of the map on the screen. 
//There are at less two persons with the same firstName among these 10 people?
//Remove from the map person whose firstName is ”Orest” (or other). Print result.  


package task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		Map<String, String> personMap = new LinkedHashMap<String, String>();
		personMap.put("First", "Orest");
		personMap.put("Second", "Nataly");
		personMap.put("Third", "George");
		personMap.put("Fourth", "Bobby");
		personMap.put("Fifth", "Lilith");
		personMap.put("Sixth", "Ronald");
		personMap.put("Seventh", "Bobby");
		personMap.put("Eighth", "Margo");
		personMap.put("Ninth", "Maria");
		personMap.put("Tenth", "Donald");

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		System.out.println();
		
		Set<String> set1 = new HashSet<String>();

		set1.addAll(personMap.values());
		if (personMap.values().size() > set1.size()) {
			System.out.println("There are at less two persons with the same firstName\n");
		} else {
			System.out.println("There are no persons with same firstName");
		}

		Iterator<Entry<String, String>> iterator = personMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
			if (entry.getValue().equals("Orest")) {
				iterator.remove();
				
			}
		}
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
			}
		System.out.println("\n Why Orest? Why it must be him?");
	}

}
