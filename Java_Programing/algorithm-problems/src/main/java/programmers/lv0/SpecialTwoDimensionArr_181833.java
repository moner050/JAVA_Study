package programmers.lv0;

import java.util.Arrays;

// 특별한 이차원 배열 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181833
public class SpecialTwoDimensionArr_181833 {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(Arrays.deepToString(solution(n)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
