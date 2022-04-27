package ch09;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<Integer>();
        scoreList.add(Integer.valueOf(83));
        scoreList.add(Integer.valueOf(69));
        scoreList.add(Integer.valueOf(92));

        for (Integer score : scoreList)
        {
            System.out.println(score.intValue());
        }
    }
}
