package HW5.task4;

import HW5.GetValues;

import java.util.ArrayList;
import java.util.List;

public class CalcOperations {
    private List<Integer> list = new ArrayList<>();

    public int initializeAndCount() {
        int result = 0;
        int temp = 0;
        while (true) {
            temp = GetValues.getInteger();
            if (temp > 0) {
                result += temp;
            } else {
                break;
            }
        }
        return result;
    }
}
