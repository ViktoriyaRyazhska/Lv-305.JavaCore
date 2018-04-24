        import java.util.HashSet;
        import java.util.Set;
public class Main{
    public static void main(String [] args){
        Methods m1 = new Methods();
        Set<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(1);

        Set <Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(3);
        set2.add(2);

        m1.union(set1, set2);
        m1.intersect(set1,set2);
    }
}