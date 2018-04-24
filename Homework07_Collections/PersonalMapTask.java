import java.util.*;

/**Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
#1 Output the entities of the map on the screen.
#2 There are at less two persons with the same firstName among these 10 people?
#3 Remove from the map person whose firstName is ”Orest” (or other). Print result.
*/

public class PersonalMapTask {

    public static void main(String[] args) {
        Map <String, String> personalMap = new HashMap();
        personalMap.put("Rogi", "Igor");
        personalMap.put("Aruy","Yura");
        personalMap.put("Tsero", "Orest");
        personalMap.put("Rogi1", "Igor1");
        personalMap.put("Aruy2","Yura2");
        personalMap.put("Tsero3", "Orest3");
        personalMap.put("Rogi4", "Igor4");
        personalMap.put("Aruy5","Yura5");
        personalMap.put("Tsero6", "Orest6");
        personalMap.put("Tsero7", "Orest");

        //#1
        System.out.println("\nEntities of personalMap");
        printOut(personalMap);

        //#2
        uniqueCheck(personalMap);

        //#3
        removeElement(personalMap);

    }

    public static void printOut(Map <String, String> personalMap){

        personalMap.forEach(
                (k, v) -> System.out.println(personalMap.get(k))
        );
    }

    public static void uniqueCheck(Map <String, String> personMap){

        Set <String> set = new HashSet<>();
       set.addAll(personMap.values());
       if (set.size() < personMap.size()){
           System.out.println("\nThere are persons with same first names");
       }
    }

    public static void removeElement(Map <String, String> personMap){

        for(Iterator<Map.Entry<String,String>>it = personMap.entrySet().iterator();it.hasNext();){
            Map.Entry<String, String> entry = it.next();
            if (entry.getValue().equals("Orest")) {
                it.remove();
            }
        }

        System.out.println("\npersonalMap without \"Orest\" is: ");
        printOut(personMap);
    }
}


