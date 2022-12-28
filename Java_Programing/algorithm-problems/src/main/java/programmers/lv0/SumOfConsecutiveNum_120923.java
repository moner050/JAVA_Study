package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 연속된 수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/120923
public class SumOfConsecutiveNum_120923 {
    public static void main(String[] args) {
        int num = 3, total = 12;
//        int num = 5, total = 15;

        System.out.println(Arrays.toString(solution(num, total)));
    }

    public static int[] solution(int num, int total) {
        List<Integer> result = new ArrayList<>();

        int a = (2 * total/num + 1 - num) / 2;

        for (int i = 0; i < num; i++) {
            result.add(i + a);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
