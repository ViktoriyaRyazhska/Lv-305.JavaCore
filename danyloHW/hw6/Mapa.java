package l9;

import java.util.*;


public class Mapa {
	public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Maksymuk", "Oleh");
        map.put("Romanyshyn","Marian");
        map.put("hh", "frv");
        map.put("sdv", "sdfs");
        map.put("svfv", "dcy");
        map.put("adccd", "sdcvsd");
        map.put("dcsd", "sdc");
        map.put("Maksymuk1", "Oleh");

        System.out.println(map);

        Set<String> set1 = new HashSet<>();

        set1.addAll(map.values());
        System.out.println(map.values().size()>set1.size());
    
        /*for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        		it.hasNext(); ) {
        	Map.Entry<String, String> entry = it.next();
        	if (entry.getKey().equals("Oleh")) { it.remove();}
*/        		
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
           Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
           if (entry.getValue().equals("Oleh")) {
        	System.out.println(entry.getKey() + " ");
           }
           
        }

        
        }
        	
        
	}
		

