package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 5명씩
// https://school.programmers.co.kr/learn/courses/30/lessons/181886
public class FiveAtATime_181886 {
    public static void main(String[] args) {
//        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx", "jayce", "garen", "ivern"};
//        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern"};
//        String[] names = {"nami", "ahri", "jayce"};

        System.out.println(Arrays.toString(solution(names)));
    }

    public static String[] solution(String[] names) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < names.length; i+=5) {
            result.add(names[i]);
        }

        return result.toArray(String[]::new);
    }
}
