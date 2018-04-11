package HW5.task1;

import HW5.GetValues;
import java.util.ArrayList;
import java.util.List;

public class AmountOfDays {
    private List<Integer> list = new ArrayList<>();

    public void initialyzeMonths(){
        list.add(31);
        list.add(28);
        list.add(31);
        list.add(30);
        list.add(31);
        list.add(30);
        list.add(31);
        list.add(31);
        list.add(30);
        list.add(31);
        list.add(30);
        list.add(31);

    }
    public void getIndexOfMonth(){
        initialyzeMonths();
        int number = GetValues.getNumberOfMonth();
        System.out.println(list.get(number-1));
    }
}
