package HW5.task3;

import HW5.GetValues;

import java.util.ArrayList;
import java.util.List;

public class FindOperations {
    private List<Integer> list = new ArrayList<>();

    public void InitializeArray(int howMuchElements) {
        for (int i = 0; i < howMuchElements; i++) {
            list.add(GetValues.getInteger());
        }
    }

    public int findSecondPosNumber() {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && result > 0) {
                result = i;
                break;
            }
            if (list.get(i) > 0) {
                result = list.get(i);
            }
        }
        return result;
    }

    public void findMinimumAndIndex(){
        int resultElem = list.get(0);
        int resultIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<resultElem){
                resultElem = list.get(i);
                resultIndex = i;
            }
        }
        System.out.println("Smaller element : " + resultElem + " He's index : " + resultIndex);
    }
}
