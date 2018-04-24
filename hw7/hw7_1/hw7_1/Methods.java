import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;
import java.util.Set;

public class Methods{

    public void union(Set set1,Set set2){
        Set set = new HashSet(set1);
        set.addAll(set2);
        System.out.println("Union = " + set);
    }
    public void intersect (Set set1, Set set2){
        Set set = new HashSet(set1);
       set.retainAll(set2);
       System.out.println("Intersected = " + set);

        System.out.println("SET1 = "+set1);
        System.out.println("SET2 = "+set2);
       // System.out.println(set1.hashCode());
       // System.out.println(set2.hashCode());
    }
}
