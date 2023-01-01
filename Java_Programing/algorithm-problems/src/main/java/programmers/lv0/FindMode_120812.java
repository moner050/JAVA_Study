package programmers.lv0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 최빈값 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120812
public class FindMode_120812 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};

        System.out.println(solution1(array));
        System.out.println(solution2(array));
    }

    public static int solution1(int[] array) {
        int cnt = 0, maxKey = -1;
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : array) {
            if(numMap.containsKey(num)) numMap.put(num, numMap.get(num) + 1);
            else numMap.put(num, 1);
        }

        int maxValue = Collections.max(numMap.values());

        for (int key : numMap.keySet()) {
            if(maxValue == numMap.get(key)) {
                maxKey = key;
                cnt++;
            }

            if(cnt >= 2) return -1;
        }

        return maxKey;
    }

    public static int solution2(int[] array) {
        int result = 0, maxValue = 0;

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : array) {
            int value = numMap.getOrDefault(num, 0) + 1;

            if(value > maxValue) {
                maxValue = value;
                result = num;
            }
            else if(value == maxValue) {
                result = -1;
            }
            numMap.put(num, value);
        }
        return result;
    }
}
