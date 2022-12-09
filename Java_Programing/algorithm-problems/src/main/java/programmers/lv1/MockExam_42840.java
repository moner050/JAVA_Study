package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class MockExam_42840 {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
//        int[] answers = {1,3,2,4,2};

        System.out.println(Arrays.toString(solution(answers)));
    }

    public static int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();
        int[] one = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int oneResult = 0, twoResult = 0, threeResult = 0;
        int j = 0;

        for (int rst : answers) {
            if(j >= 40) j = 0;
            if(rst == one[j]) oneResult++;
            if(rst == two[j]) twoResult++;
            if(rst == three[j]) threeResult++;
            j++;
        }

        int rst = Math.max(Math.max(oneResult, twoResult), Math.max(twoResult, threeResult));

        if(rst != 0) {
            if(rst == oneResult && oneResult == twoResult && twoResult == threeResult) {
                result.add(1);
                result.add(2);
                result.add(3);
            }
            else if(rst == oneResult && oneResult == twoResult) {
                result.add(1);
                result.add(2);
            }
            else if(rst == oneResult && oneResult == threeResult) {
                result.add(1);
                result.add(3);
            }
            else if(rst == oneResult) {
                result.add(1);
            }
            else if(rst == twoResult && twoResult == threeResult) {
                result.add(2);
                result.add(3);
            }
            else if(rst == twoResult) {
                result.add(2);
            }
            else {
                result.add(3);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
