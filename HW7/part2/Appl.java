package part2;

import java.util.*;
import java.util.Map.Entry;

public class Appl {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<>();
		personMap.put("Holiash", "Dmytro");
		personMap.put("Kopach", "Andrii");
		personMap.put("Zagorodnyk", "Artur");
		personMap.put("Tarasov", "Petro");
		personMap.put("Ivanov", "Orest");
		personMap.put("Lubchenko", "Ira");
		personMap.put("Fedorov", "Orest");
		personMap.put("Boyko", "Maryan");
		personMap.put("Stepanova", "Olya");
		personMap.put("Fedorenko", "Maria");
		System.out.println(personMap);

		HashMap<String, String> copy = new HashMap<String, String>(personMap);
		for (Map.Entry<String, String> pair : copy.entrySet()) {
			int freqeuncy = Collections.frequency(copy.values(), pair.getValue());
			if (freqeuncy > 1) {
				System.out.println("true");
			} else
				System.out.println("false");
		}

		String name = "Orest";
		if (personMap.containsValue(name)) {
			Iterator iterator = personMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
				if (entry.getValue().equals(name)) {
					iterator.remove();
				}
			}
		}
		
		
		System.out.println(personMap);

	}

}
