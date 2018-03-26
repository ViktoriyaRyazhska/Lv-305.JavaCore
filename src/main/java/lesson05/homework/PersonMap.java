package lesson05.homework;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    static <T> void printEntities(Map<T, T> map) {
        map.forEach((x, y) -> System.out.println(y));
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Adr", "Bav");
        map.put("Car", "Tor");
        map.put("Ras", "Mep");
        map.put("Cre", "Lin");
        map.put("Gro", "Dax");
        map.put("Pli", "Max");
        map.put("Mak", "Der");
        map.put("Orest", "Ven");
        map.put("Van", "Kan");
        map.put("Der", "Pir");

        printEntities(map);
        map.remove("Orest");
        System.out.println();
        printEntities(map);
    }
}
