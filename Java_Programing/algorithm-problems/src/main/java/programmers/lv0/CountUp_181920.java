package programmers.lv0;

import java.util.Arrays;

// 카운트 업
// https://school.programmers.co.kr/learn/courses/30/lessons/181920
public class CountUp_181920 {
    public static void main(String[] args) {
        int start = 3, end = 10;

        System.out.println(Arrays.toString(solution(start, end)));
    }

    public static int[] solution(int start, int end) {
        int idx = 0;
        int[] result = new int[end - start + 1];

        for (int i = start; i <= end; i++, idx++) {
            result[idx] = i;
        }

        return result;
    }
}
