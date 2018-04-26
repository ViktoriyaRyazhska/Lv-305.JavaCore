package HW7.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Ololow", "Alex");
        personMap.put("tr", "Alex");
        personMap.put("tyty", "lol");
        personMap.put("dhdhd", "kek");
        personMap.put("tbwb", "4eburek");
        personMap.put("hgfdhdhdh", "tototo");
        personMap.put("dfdsfddf", "opop");
        personMap.put("sddfsdfsdfs", "opopop");
        personMap.put("sdfdfsfdsjjj", "opooi");
        personMap.put("fsdfs", "R2D2");

        // 1 Output the entities of the map on the screen.
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("lastName = " + entry.getKey() + " firstName = " + entry.getValue());
        }
        //2
        System.out.println(lessThanTwoValues(personMap));

        //3
        removeOrestFromMap(personMap);

    }

    //There are at less two persons with the same firstName among these 10 people?
    public static boolean lessThanTwoValues(Map<String, String> personMap) {
        int count = 0;
        String temp = "";
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            temp = entry.getValue();
            for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
                if (entry1.getValue().equals(temp)){
                    count++;
                }
            }
        }
        if (count>=1){
            return true;
        }else {
            return false;
        }
    }
    //Remove from the map person whose firstName is ”Orest” (or other). Print result.
    public static Map<String, String> removeOrestFromMap(Map<String, String> personMap){
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals("Orest")){
                personMap.remove(entry.getKey());
            }
        }
        return personMap;
    }

}
