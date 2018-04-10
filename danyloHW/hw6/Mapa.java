package l9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    }
}
