package programmers.lv0;

import java.util.Arrays;

// 카운트 다운
// https://school.programmers.co.kr/learn/courses/30/lessons/181899
public class CountDown_181899 {
    public static void main(String[] args) {
        int start = 10, end = 3;

        System.out.println(Arrays.toString(solution(start, end)));
    }

    public static int[] solution(int start, int end) {
        int idx = 0;
        int[] result = new int[start - end + 1];

        for (int i = start; i >= end; i--, idx++) {
            result[idx] = i;
        }

        return result;
    }
}
