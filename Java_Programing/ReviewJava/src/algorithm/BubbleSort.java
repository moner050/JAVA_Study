package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public static void main(String[] args) {

        ArrayList<Integer> dataList = new ArrayList<>();

        dataList.add(9);
        dataList.add(3);
        dataList.add(2);

        for (int i = 0; i < dataList.size()-1; i++) {
            for (int j = 0; j < dataList.size() - 1 - i; j++) {
                if(dataList.get(j) > dataList.get(j + 1) ) Collections.swap(dataList, j, j+1);
            }
        }

        System.out.println(dataList);
    }
}
