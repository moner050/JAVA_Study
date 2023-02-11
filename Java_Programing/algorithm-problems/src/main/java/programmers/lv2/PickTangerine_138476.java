package programmers.lv2;

import java.util.*;

// 귤 고르기
// https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class PickTangerine_138476 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        System.out.println(solution(k, tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        int result = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }

        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Collections.reverseOrder());

        for (int value : valueList) {
            k -= value;
            result++;
            if(k < 1) return result;
        }

        return result;
    }
}
