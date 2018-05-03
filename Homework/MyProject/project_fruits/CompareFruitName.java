package project_fruits;
import java.util.Comparator;

public class CompareFruitName implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		return o1.getFruitName().compareToIgnoreCase(o2.getFruitName());
	}
}
