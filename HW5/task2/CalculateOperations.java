package HW5.task2;

import HW5.GetValues;

import java.util.ArrayList;
import java.util.List;

public class CalculateOperations {
    private List<Integer> list = new ArrayList<>();

    public void InitializeArray(int howMuchElements) {
        for (int i = 0; i < howMuchElements; i++) {
            list.add(GetValues.getInteger());
        }
    }

    public int calculateSumOrProduct() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (list.get(i) > 0) {
                result += list.get(i);
            } else {
                for (int j = 5; j < 9; j++) {
                    result *= list.get(j);
                }
                return result;
            }
        }
        return result;
    }
}
