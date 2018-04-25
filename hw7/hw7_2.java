package hw7_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hw7_2 {
	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<>();
		personMap.put("Antonjuk", "Orest");
		personMap.put("Sheremet", "Petro");
		personMap.put("Kurulchyk", "Nadija");
		personMap.put("Smereka", "Yliana");
		personMap.put("Palij", "Maria");
		personMap.put("Pavlenko", "Ivan");
		personMap.put("Obal", "Ostap");
		personMap.put("Muzuka", "Oleg");
		personMap.put("Melnuk", "Nina");
		personMap.put("Lutvun", "Inna");

		System.out.println("List of person: ");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + "_" + entry.getValue());
		}
		int sameName = 0;

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			for (Map.Entry<String, String> entry2 : personMap.entrySet()) {
				if ((entry.getValue() == entry2.getValue()) && (entry.getKey() != entry2.getKey())) {
					sameName++;
				}
			}
		}
		if (sameName > 0) {
			System.out.println("Min two persons with the same name.");
		} else
			System.out.println("There are no people with the same name.");

		Iterator<Map.Entry<String, String>> i = personMap.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, String> entry = i.next();
			if (entry.getValue() == "Orest") {
				i.remove();
				System.out.println("A person named Orest was removed from the list");
			}
		}
		System.out.println("New list: ");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + "_" + entry.getValue());
		}
	}
}