package programmers.lv0;

import java.util.Arrays;

// 배열 만들기1
// https://school.programmers.co.kr/learn/courses/30/lessons/181901
public class CreateArr_181901 {
    public static void main(String[] args) {
        int n = 10, k = 3;

        System.out.println(Arrays.toString(solution(n, k)));
    }

    public static int[] solution(int n, int k) {
        int idx = 0;
        int[] result = new int[n / k];

        for (int i = k; i <= n; i+=k, idx++) {
            result[idx] = i;
        }

        return result;
    }
}
